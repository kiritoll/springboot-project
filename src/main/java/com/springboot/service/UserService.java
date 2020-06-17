package com.springboot.service;

import com.springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}
