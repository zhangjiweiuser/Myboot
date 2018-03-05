package com.zhang.jiwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-02 下午 15:25
 */
@RestController
public class HelloController {

    @RequestMapping(path = "/")
    public String index() {
        return "Greeting to spring boot";
    }
}
