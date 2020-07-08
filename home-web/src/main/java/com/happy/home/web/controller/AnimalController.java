package com.happy.home.web.controller;

import com.happy.home.web.config.AnimalConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/info")
    public String animalInfo(){
        return animal.toString();
    }
}
