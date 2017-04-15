package com.lw.sb.dd.controller;

import com.lw.sb.dd.bean.RandomBean;
import com.lw.sb.dd.bean.TestUser;
import com.lw.sb.dd.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lw on 2017/4/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    User user;

    @Autowired
    TestUser testUser;

    @Autowired
    RandomBean bean;

    @RequestMapping("/")
    public String hello() {
        return user.getName() + ":" + user.getWant();
    }

    @RequestMapping("/test")
    public String hello2() {
        return testUser.getName() + ":" + testUser.getWant();
    }

    @RequestMapping("/random")
    public String hello3() {
        return bean.getValue() + ":" + bean.getNumber() + ":" + bean.getBignumber() + ":" + bean.getUuid();
    }

    /**
     * 登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String want = request.getParameter("want");
        Map<String, Object> map = new HashMap<String, Object>();
        if (!StringUtils.isEmpty(name) && !StringUtils.isEmpty(want)) {
            User user = new User();
            user.setName(name);
            user.setWant(want);
            request.getSession().setAttribute("user", user);
            map.put("result", "1");
            System.out.println("登录成功===========");
        } else {
            map.put("result", "0");
            System.out.println("登录失败************");
        }
        return map;
    }

}
