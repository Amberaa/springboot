package com.example.springbootproperties.controller;

import com.example.springbootproperties.property.ConfigProperty;
import com.example.springbootproperties.property.ValueProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class propertyController {
    @Autowired
    private ValueProperty valueProperty;
    @Autowired
    private ConfigProperty configProperty;

    @GetMapping("/two")
    public String type(){

        System.out.println("@Value  " + valueProperty);
        System.out.println("@ConfigurationProperties "+ configProperty);
        return "yes";
    }
}
