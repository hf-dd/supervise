package com.hbu.service.impl;

import com.hbu.mapper.UserMapper;
import com.hbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void selAll() {
        System.out.println("hello");
    }
}
