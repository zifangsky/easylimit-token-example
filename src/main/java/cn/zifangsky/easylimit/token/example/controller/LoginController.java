package cn.zifangsky.easylimit.token.example.controller;

import cn.zifangsky.easylimit.access.Access;
import cn.zifangsky.easylimit.access.impl.ExposedTokenAccess;
import cn.zifangsky.easylimit.authc.ValidatedInfo;
import cn.zifangsky.easylimit.authc.impl.UsernamePasswordValidatedInfo;
import cn.zifangsky.easylimit.enums.EncryptionTypeEnums;
import cn.zifangsky.easylimit.session.impl.support.SimpleAccessToken;
import cn.zifangsky.easylimit.session.impl.support.SimpleRefreshToken;
import cn.zifangsky.easylimit.token.example.Constants;
import cn.zifangsky.easylimit.token.example.model.SysUser;
import cn.zifangsky.easylimit.utils.SecurityUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录、注销
 *
 * @author zifangsky
 * @date 2019/5/29
 * @since 1.0.0
 */
@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 登录验证
     * @author zifangsky
     * @date 2019/5/29 13:23
     * @since 1.0.0
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String,Object> check(HttpServletRequest request){
        Map<String,Object> result = new HashMap<>(4);
        result.put("code",500);

        try {
            //用户名
            String username = request.getParameter("username");
            //密码
            String password = request.getParameter("password");
            //获取本次请求实例
            ExposedTokenAccess access = (ExposedTokenAccess) SecurityUtils.getAccess();

            if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
                result.put("msg","请求参数不能为空！");
                return result;
            }else{
                logger.debug(MessageFormat.format("用户[{0}]正在请求登录", username));

                //设置验证信息
                ValidatedInfo validatedInfo = new UsernamePasswordValidatedInfo(username, password, EncryptionTypeEnums.Sha256Crypt);

                //1. 登录验证
                access.login(validatedInfo);
            }

            //2. session中添加用户信息
            HttpSession session = request.getSession();
            session.setAttribute(Constants.SESSION_USER, access.getPrincipalInfo().getPrincipal());

            //3. 获取Access Token和Refresh Token
            SimpleAccessToken accessToken = access.getAccessToken();
            SimpleRefreshToken refreshToken = access.getRefreshToken();

            //4. 返回给页面的数据
            result.put("code",200);
            result.put("access_token", accessToken.getAccessToken());
            result.put("refresh_token", refreshToken.getRefreshToken());
            result.put("expires_in", accessToken.getExpiresIn());
            result.put("user_info", accessToken.getPrincipalInfo().getPrincipal());
        }catch (Exception e){
            result.put("code", 500);
            result.put("msg", "登录失败，用户名或密码错误！");

            logger.error("登录失败",e);
        }

        return result;
    }

    /**
     * 刷新Access Token
     * @author zifangsky
     * @date 2019/5/29 13:23
     * @since 1.0.0
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "/refreshToken", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String,Object> refreshAccessToken(HttpServletRequest request){
        Map<String,Object> result = new HashMap<>(4);
        result.put("code",500);

        try {
            //Refresh Token
            String refreshTokenStr = request.getParameter("refresh_token");
            //获取本次请求实例
            ExposedTokenAccess access = (ExposedTokenAccess) SecurityUtils.getAccess();

            //1. 刷新Access Token
            SimpleAccessToken newAccessToken = access.refreshAccessToken(refreshTokenStr);

            //2. 返回给页面的数据
            result.put("code",200);
            result.put("access_token", newAccessToken.getAccessToken());
            result.put("expires_in", newAccessToken.getExpiresIn());
            result.put("refresh_token", refreshTokenStr);
        }catch (Exception e){
            result.put("code", 500);
            result.put("msg", "Refresh Token不可用！");

            logger.error("登录失败",e);
        }

        return result;
    }

    /**
     * 退出登录
     * @author zifangsky
     * @date 2019/5/29 17:44
     * @since 1.0.0
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @PostMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String,Object> logout(HttpServletRequest request){
        Map<String,Object> result = new HashMap<>(1);
        HttpSession session = request.getSession();
        SysUser user = (SysUser) session.getAttribute(Constants.SESSION_USER);

        if(user != null){
            logger.debug(MessageFormat.format("用户[{0}]正在退出登录", user.getUsername()));
        }

        try {
            //1. 移除session中的数据
            session.removeAttribute(Constants.SESSION_USER);

            //2. 退出登录
            Access access = SecurityUtils.getAccess();
            access.logout();

            //3. 返回状态码
            result.put("code", 200);
        }catch (Exception e){
            result.put("code",500);
        }

        return result;
    }




}
