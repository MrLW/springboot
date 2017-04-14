package com.lw.sb.dd.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by lw on 2017/4/14.
 */
// 这里添加了Configuration注解那么在SpringbootSampleApplication里就不需要指定加载的配置文件了
@Configuration
// 配置bean的'package'
@ConfigurationProperties(prefix = "com.md")
// 加载普通的配置文件
@PropertySource("classpath:application2.yml")
public class TestUser {
    private String name ;
    private String want ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
