package com.zhang.jiwei.controller;

import com.zhang.jiwei.entity.ConfigBean;
import com.zhang.jiwei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-02 下午 16:22
 */
@RestController
public class LucyController {

    @Autowired
    ConfigBean configBean;

    @Autowired
    User user;

    @RequestMapping(value = "/lucy")
    public String lucy() {
        return configBean.toString();
    }

    @RequestMapping(value = "/user")
    public String user() {
        return user.toString();
    }
}
