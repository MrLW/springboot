package com.lw.sb.dd.bean;

/**
 * Created by lw on 2017/4/14.
 */
public class Course {
    private String name;
    private String text;
    private String site ;

    public Course(String name, String text, String site) {
        this.name = name;
        this.text = text;
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
