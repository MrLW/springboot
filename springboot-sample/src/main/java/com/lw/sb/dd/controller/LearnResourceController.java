package com.lw.sb.dd.controller;

import com.lw.sb.dd.bean.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lw on 2017/4/14.
 */
@Controller
@RequestMapping("/learn")
public class LearnResourceController {

    @RequestMapping("/")
    public ModelAndView index(){
        List<Course> courseList = new ArrayList<>() ;
        courseList.add(new Course("java","很难","java.com")) ;
        courseList.add(new Course("JS","中等","JS.com")) ;
        courseList.add(new Course("HTML","简单","html.com")) ;
        ModelAndView md = new ModelAndView("/index") ;
        md.addObject("courseList",courseList) ;
        return md ;
    }
}
