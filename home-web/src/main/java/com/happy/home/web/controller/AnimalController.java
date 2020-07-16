package com.happy.home.web.controller;

import com.happy.home.web.common.ServiceApplication;
import com.happy.home.web.config.AnimalConfig;
import com.happy.home.web.feign.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: lijixiao
 * @date: 2020-07-08
 */
@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Resource
    private AnimalConfig animal;
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HelloService helloService;

    @GetMapping("/info")
    public String animalInfo(){
        return animal.toString();
    }

    @GetMapping("/template/hello")
    public String tHello(){
        String url = "http://" + ServiceApplication.SERVICE_APPLICATION + "/service/hello/animal";
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/feign/hello")
    public String fHello(){
        return helloService.helloAnimal();
    }
}
