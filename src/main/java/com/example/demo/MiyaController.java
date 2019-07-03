package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaql
 * @create 2019-06-28 15:39
 */
@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @RequestMapping(value = "/miya")
    public String miya() {
        return name +":"+ age;
    }
}
