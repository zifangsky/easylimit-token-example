package cn.zifangsky.easylimit.token.example.easylimit;

import cn.zifangsky.easylimit.authc.PrincipalInfo;
import cn.zifangsky.easylimit.authc.ValidatedInfo;
import cn.zifangsky.easylimit.authc.impl.SimplePrincipalInfo;
import cn.zifangsky.easylimit.authc.impl.UsernamePasswordValidatedInfo;
import cn.zifangsky.easylimit.token.example.mapper.SysFunctionMapper;
import cn.zifangsky.easylimit.token.example.mapper.SysRoleMapper;
import cn.zifangsky.easylimit.token.example.mapper.SysUserMapper;
import cn.zifangsky.easylimit.token.example.model.SysFunction;
import cn.zifangsky.easylimit.token.example.model.SysRole;
import cn.zifangsky.easylimit.token.example.model.SysUser;
import cn.zifangsky.easylimit.exception.authc.AuthenticationException;
import cn.zifangsky.easylimit.permission.PermissionInfo;
import cn.zifangsky.easylimit.permission.impl.SimplePermissionInfo;
import cn.zifangsky.easylimit.realm.impl.AbstractPermissionRealm;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 自定义{@link cn.zifangsky.easylimit.realm.Realm}
 *
 * @author zifangsky
 * @date 2019/5/28
 * @since 1.0.0
 */
public class CustomRealm extends AbstractPermissionRealm {

    private SysUserMapper sysUserMapper;

    private SysRoleMapper sysRoleMapper;

    private SysFunctionMapper sysFunctionMapper;

    public CustomRealm(SysUserMapper sysUserMapper, SysRoleMapper sysRoleMapper, SysFunctionMapper sysFunctionMapper) {
        this.sysUserMapper = sysUserMapper;
        this.sysRoleMapper = sysRoleMapper;
        this.sysFunctionMapper = sysFunctionMapper;
    }

    /**
     * 自定义“角色+权限”信息的获取方式
     */
    @Override
    protected PermissionInfo doGetPermissionInfo(PrincipalInfo principalInfo) {
        SimplePermissionInfo permissionInfo = null;

        //获取用户信息
        SysUser sysUser = (SysUser) principalInfo.getPrincipal();
        if(sysUser != null){

            //通过用户ID查询角色权限信息
            Set<SysRole> roleSet = sysRoleMapper.selectByUserId(sysUser.getId());
            if(roleSet != null && roleSet.size() > 0){
                //所有角色名
                Set<String> roleNames = new HashSet<>(roleSet.size());
                //所有权限的code集合
                Set<String> funcCodes = new HashSet<>();

                for(SysRole role : roleSet){
                    roleNames.add(role.getName());

                    Set<SysFunction> functionSet = sysFunctionMapper.selectByRoleId(role.getId());
                    if(functionSet != null && functionSet.size() > 0){
                        funcCodes.addAll(functionSet.stream().map(SysFunction::getPathUrl).collect(Collectors.toSet()));
                    }
                }

                //实例化
                permissionInfo = new SimplePermissionInfo(roleNames, funcCodes);
            }
        }

        return permissionInfo;
    }

    /**
     * 自定义从表单的验证信息获取数据库中正确的用户主体信息
     */
    @Override
    protected PrincipalInfo doGetPrincipalInfo(ValidatedInfo validatedInfo) throws AuthenticationException {
        //已知是“用户名+密码”的登录模式
        UsernamePasswordValidatedInfo usernamePasswordValidatedInfo = (UsernamePasswordValidatedInfo) validatedInfo;

        SysUser sysUser = sysUserMapper.selectByUsername(usernamePasswordValidatedInfo.getSubject());

        return new SimplePrincipalInfo(sysUser, sysUser.getUsername(), sysUser.getPassword());
    }

}
