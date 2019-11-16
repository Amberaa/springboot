package com.example.springbootproperties.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过@ConfigurationProperties()方式读取配置文件
 */
@Data
@RestController
@ConfigurationProperties(prefix = "student")
public class ConfigurationController {
    private String name;
    private Integer age;
    private String phone;

    @GetMapping("/config")
    public String configurationType(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);

        return "@ConfigurationProperties()方式";
    }
}
