package com.example.springbootproperties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Value()
 */
@Data
@Component
public class ValueProperty {
    @Value("${student.name}")
    private String studentName;
    @Value("${student.age}")
    private Integer studentAge;
    @Value("${student.phone}")
    private String studentPhone;

}
