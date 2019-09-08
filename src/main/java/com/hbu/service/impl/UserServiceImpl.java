package com.hbu.service.impl;

import com.hbu.mapper.UserMapper;
import com.hbu.pojo.User;
import com.hbu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void selAll() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
