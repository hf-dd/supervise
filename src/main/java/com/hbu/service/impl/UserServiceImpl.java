package com.hbu.service.impl;

import com.hbu.mapper.UserMapper;
import com.hbu.pojo.User;
import com.hbu.pojo.UserExample;
import com.hbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void selAll() {
        System.out.println("hello");
    }
}
