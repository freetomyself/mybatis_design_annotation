package com.itcast.mybatis.utils;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.utils
 * @author: WaHotDog 2019-08-07 15:27
 **/

import com.itcast.mybatis.cfg.Configuration;
import com.itcast.mybatis.sqlsession.SqlSession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 用于创建数据库连接工具
 */
public class DataSourceUtil  {
    /**
     * 用于获取一个数据源
     * @param cfg
     * @return
     */
    public static Connection getConnection(Configuration cfg)  {
        try {

            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        }catch (Exception e){
            throw new RuntimeException("数据连接出错");
        }
    }
}
