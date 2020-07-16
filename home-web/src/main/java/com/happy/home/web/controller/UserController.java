package com.happy.home.web.controller;

import com.happy.home.web.common.ServiceApplication;
import com.happy.home.web.config.UserConfig;
import com.happy.home.web.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HelloService helloService;

    @GetMapping("/info")
    public String userInfo(){
        return user.toString();
    }

    @GetMapping("/template/hello")
    public String tHello(){
        String url = "http://" + ServiceApplication.SERVICE_APPLICATION + "/service/hello/user";
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/feign/hello")
    public String fHello(){
        return helloService.helloUser();
    }
}
