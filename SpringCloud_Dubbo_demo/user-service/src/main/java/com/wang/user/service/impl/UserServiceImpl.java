package com.wang.user.service.impl;



import com.wang.dubbo.api.UserService;
import com.wang.dubbo.domain.User;
import com.wang.user.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

// 修改UserService实现UserApi接口。并使用@DubboService注解替换@Service对外暴露dubbo服务
@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}