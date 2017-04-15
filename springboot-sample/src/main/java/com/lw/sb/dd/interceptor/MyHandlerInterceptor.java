package com.lw.sb.dd.interceptor;

import com.lw.sb.dd.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lw on 2017/4/15.
 * <p>
 * Springboot实现拦截器的步骤
 * 1、创建拦截器类,实现HandlerInterceptor接口
 * 2、在WebMvcConfigurerAdapter中重写addInterceptors方法
 */
public class MyHandlerInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        boolean isLogin = true;
        if (null == user) {
            response.sendRedirect("toLogin");
            isLogin = false;
        } else { // 已经登录
            isLogin = true;
        }
        // 已经登录放行
        return isLogin;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
