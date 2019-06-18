package cn.zifangsky.easylimit.token.example.service;

import cn.zifangsky.easylimit.token.example.model.Greeting;
import cn.zifangsky.easylimit.token.example.model.HelloMessage;
import cn.zifangsky.easylimit.token.example.model.SysUser;

/**
 * 测试
 *
 * @author zifangsky
 * @date 2019/5/29
 * @since 1.0.0
 */
public interface TestService {

    HelloMessage greeting(Greeting greeting, String ip);

    SysUser selectByUsername(String username);
}
