package cn.zifangsky.easylimit.token.example.controller;

import cn.zifangsky.easylimit.token.example.model.Greeting;
import cn.zifangsky.easylimit.token.example.model.HelloMessage;
import cn.zifangsky.easylimit.token.example.model.SysUser;
import cn.zifangsky.easylimit.token.example.service.TestService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 测试使用
 *
 * @author zifangsky
 * @date 2019/5/30
 * @since 1.0.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource(name = "testServiceImpl")
    private TestService testService;

    @PostMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public HelloMessage greeting(@RequestBody Greeting greeting, HttpServletRequest request){
        return testService.greeting(greeting, request.getRemoteHost());
    }

    @ResponseBody
    @RequestMapping(value = "/selectByUsername", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SysUser selectByUsername(String username) {
        return testService.selectByUsername(username);
    }

}
