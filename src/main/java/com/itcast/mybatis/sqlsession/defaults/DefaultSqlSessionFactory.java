package com.itcast.mybatis.sqlsession.defaults;

import com.itcast.mybatis.cfg.Configuration;
import com.itcast.mybatis.sqlsession.SqlSession;
import com.itcast.mybatis.sqlsession.SqlSessionFactory;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.sqlsession.defaults
 * @author: WaHotDog 2019-08-07 14:24
 **/


public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;
    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg=cfg;
    }

    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
