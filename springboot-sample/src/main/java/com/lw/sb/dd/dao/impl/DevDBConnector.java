package com.lw.sb.dd.dao.impl;

import com.lw.sb.dd.dao.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by lw on 2017/4/14.
 */
@Profile("devdb")
@Component
class DevDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("开发数据库");
    }
}
