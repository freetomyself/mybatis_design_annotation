package com.itcast.mybatis.sqlsession;

import com.itcast.mybatis.cfg.Configuration;
import com.itcast.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.itcast.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.sqlsession
 * @author: WaHotDog 2019-08-07 10:04
 **/

/**
 * 用于创建一个SqlSessinFactory对象
 */
public class SqlSessionFactoryBuilder {
    /**
     * 通过字节构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }

}
