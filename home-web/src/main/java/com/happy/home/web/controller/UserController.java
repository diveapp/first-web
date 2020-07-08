package com.happy.home.web.controller;

import com.happy.home.web.config.UserConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: lijixiao
 * @date: 2020-07-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserConfig user;

    @GetMapping("/info")
    public String userInfo(){
        return user.toString();
    }
}
