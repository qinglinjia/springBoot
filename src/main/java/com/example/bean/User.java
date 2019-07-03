package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author jiaql
 * @create 2019-06-28 16:16
 */
@Configuration
@PropertySource(value = "classpath:test.yml")
@ConfigurationProperties(prefix = "com.jiaql")
public class User {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
