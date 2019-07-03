package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaql
 * @create 2019-06-28 15:08
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greeting from Spring Boot";
    }
}
