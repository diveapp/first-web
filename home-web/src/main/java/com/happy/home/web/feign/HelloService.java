package com.happy.home.web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lijixiao
 * @date: 2020-07-16
 */
@FeignClient("home-service")
public interface HelloService {

    @GetMapping("/service/hello/animal")
    String helloAnimal();

    @GetMapping("/service/hello/user")
    String helloUser();
}
