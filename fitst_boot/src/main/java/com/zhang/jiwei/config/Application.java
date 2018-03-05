package com.zhang.jiwei.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-02 下午 15:24
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zhang.jiwei")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
