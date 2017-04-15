package com.lw.sb.dd.adapter;

import com.lw.sb.dd.interceptor.MyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lw on 2017/4/15.
 */

/**
 * 使用@Configuration表标志的类相当于在xml中的beans
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    /**
     * 配置静态访问资源
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myviews/**") // 添加映射路径,也就是对外暴露的访问路径
                .addResourceLocations("classpath:/myviews/"); // 指定路径
        super.addResourceHandlers(registry);
    }

    /**
     * 配置控制器
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("toLogin") // 访问的URL
                .setViewName("login"); // 跳转的jsp页面:login.jsp====>相当于SpringMVC的ModelAndView
        super.addViewControllers(registry);
    }

    /**
     * 添加拦截器
     * 第二步
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor())
                .addPathPatterns("/**") // 拦截所有请求
                .excludePathPatterns("/toLogin", "/login"); // 除了toLogin、login的请求之外
        super.addInterceptors(registry);
    }
}
