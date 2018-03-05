package com.zhang.jiwei.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-02 下午 16:20
 */
@ConfigurationProperties(prefix = "my")
@Component
@Data
public class ConfigBean {

    private String name;

    private int age;

    private int number;

    private String uuid;

    private int max;

    private String value;

    private String greeting;

}
