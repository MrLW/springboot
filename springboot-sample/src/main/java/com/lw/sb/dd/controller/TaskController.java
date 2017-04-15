package com.lw.sb.dd.controller;

import com.lw.sb.dd.dao.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lw on 2017/4/14.
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    DBConnector connector ;

    /**
     * @RequestMapping和@RequestMapping("/")的区别
     */
    @RequestMapping("/")
    public String helloTask(){
        connector.configure();
        return "hello task !!" ;
    }
}
