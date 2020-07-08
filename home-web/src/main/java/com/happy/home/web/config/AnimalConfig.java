package com.happy.home.web.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: lijixiao
 * @date: 2020-07-07
 */
@Data
@ToString
@Component
@RefreshScope
@ConfigurationProperties(prefix = "happy.animal")
public class AnimalConfig {

    private String nick;
    private Integer age;
}
