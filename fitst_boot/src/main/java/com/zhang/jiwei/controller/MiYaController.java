package com.zhang.jiwei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-02 下午 16:11
 */
@RestController
public class MiYaController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @RequestMapping(path = "/info")
    public String info() {
        return name + ":" + age;
    }
}
