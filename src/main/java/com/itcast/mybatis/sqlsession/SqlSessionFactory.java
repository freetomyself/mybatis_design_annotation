package com.itcast.mybatis.sqlsession;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.sqlsession
 * @author: WaHotDog 2019-08-07 10:06
 **/


public interface SqlSessionFactory {
    /**
     * 打开一个新的session对象
     * @return
     */
    SqlSession openSession();
}
