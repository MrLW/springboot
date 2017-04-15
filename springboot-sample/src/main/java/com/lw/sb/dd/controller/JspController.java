package com.lw.sb.dd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * Created by lw on 2017/4/14.
 */
@Controller
@RequestMapping("/jsp")
public class JspController {

    @Value("${application.hello}")
    private String hello ;

    @RequestMapping("/index")
    public ModelAndView index(Map<String, Object> model){
        ModelAndView md = new ModelAndView("/index");
        md.addObject("time",new Date());
        md.addObject("message",hello) ;
        return md ;
    }
}
