package com.zhang.jiwei.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-02 下午 16:29
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.zhang")
@Data
public class User {

    private String name;

    private int age;

}
