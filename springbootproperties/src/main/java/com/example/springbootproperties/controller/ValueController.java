package com.example.springbootproperties.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过@Value("${displayName}") 方式读取配置文件
 */
@Data
@RestController
public class ValueController {

    @Value("${student.name}")
    private String studentName;
    @Value("${student.age}")
    private Integer studentAge;
    @Value("${student.phone}")
    private String studentPhone;

    @GetMapping("/value")
    public String valueType(){
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(studentPhone);

        return "@Value（）方式";
    }
}
