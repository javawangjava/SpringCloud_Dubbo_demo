package com.wang.dubbo.api;


import com.wang.dubbo.domain.User;

// 要使用实体类，所以要在当前微服务的pom文件中引入dubbo-domains
public interface UserService {

    User queryById(Long id);
}
