package cn.zifangsky.easylimit.token.example.service.impl;

import cn.zifangsky.easylimit.token.example.mapper.SysUserMapper;
import cn.zifangsky.easylimit.token.example.model.Greeting;
import cn.zifangsky.easylimit.token.example.model.HelloMessage;
import cn.zifangsky.easylimit.token.example.model.SysUser;
import cn.zifangsky.easylimit.token.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 *
 * @author zifangsky
 * @date 2017/12/5
 * @since 1.0.0
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {

    @Autowired
    private SysUserMapper userMapper;


    @Override
    public HelloMessage greeting(Greeting greeting, String ip) {
        HelloMessage message = new HelloMessage();
        if(greeting != null){
            message.setContent("Hello <" + greeting.getName() + "," + greeting.getAge() + ">,Welcome!");
        }

        return message;
    }

    @Override
    public SysUser selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
