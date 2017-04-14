package com.lw.sb.dd.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lw on 2017/4/14.
 */
@ConfigurationProperties(prefix = "com.lw")
public class User {

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
