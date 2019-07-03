package com.example.demo;

import com.example.bean.ConfigBean;
import com.example.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaql
 * @create 2019-06-28 15:59
 */
@EnableConfigurationProperties({ConfigBean.class,User.class})
@RestController
public class LucyController {
    @Autowired
    private ConfigBean configBean;

    @Autowired
    private User user;

    @RequestMapping("/lucy")
    public String miya() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @RequestMapping("/user")
    public String user() {
        return user.getName()  + user.getAge();
    }
}
