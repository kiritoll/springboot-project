package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("xiaoming");
        user.setSex("nan");
        user.setAge(18);

        return user;
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

}
