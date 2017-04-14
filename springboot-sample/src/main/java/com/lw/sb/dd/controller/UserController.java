package com.lw.sb.dd.controller;

import com.lw.sb.dd.bean.TestUser;
import com.lw.sb.dd.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lw on 2017/4/14.
 */
@RestController
public class UserController {
    @Autowired
    User user;

    @Autowired
    TestUser testUser ;

    @RequestMapping("/")
    public String hello(){
        return user.getName() + ":" + user.getWant() ;
    }

    @RequestMapping("/test")
    public String hello2(){
        return testUser.getName() + ":" + testUser.getWant() ;
    }

}
