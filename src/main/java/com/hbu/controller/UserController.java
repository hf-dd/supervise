package com.hbu.controller;

import com.hbu.pojo.User;
import com.hbu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Auther:http://www.hf.com
 * @Date:2019/9/7
 * @Description:com.hbu.controller
 * @version:1.0
 */
@Controller
public class UserController {
    @Resource
    private UserService userServiceImpl;

    @RequestMapping("show")
    public String show(){
        this.userServiceImpl.selAll();
        return "index";
    }
}
