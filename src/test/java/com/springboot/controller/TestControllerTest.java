package com.springboot.controller;

import com.springboot.SpringbootApplication;
import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(classes = SpringbootApplication.class)
class TestControllerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void getUser() {
        System.out.println(1);
    }

    @Test
    void queryUser() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}