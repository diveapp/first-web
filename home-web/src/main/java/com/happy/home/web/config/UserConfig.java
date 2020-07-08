package com.happy.home.web.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: lijixiao
 * @date: 2020-07-07
 */
@RefreshScope
@Data
@Component
@ToString
public class UserConfig {

    @Value("${happy.user.name}")
    private String name;
    @Value("${happy.user.age}")
    private Integer age;
}
