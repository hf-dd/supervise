package com.hbu.service.impl;

import com.hbu.mapper.UserMapper;
import com.hbu.pojo.User;
import com.hbu.pojo.UserExample;
import com.hbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:http://www.hf.com
 * @Date:2019/9/7
 * @Description:com.hbu.service.impl
 * @version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void selAll() {
        UserExample example = new UserExample();
        List<User> list = userMapper.selectByExample(example);
    }
}
