package com.itcast.mybatis.sqlsession;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.sqlsession
 * @author: WaHotDog 2019-08-07 11:22
 **/

/**
 * 自定义mybatis和数据库交互的核心类
 * 可以创建dao代理对象
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass
     * @param <T>
     * @return
     */
    <T> T  getMapper(Class<T> daoInterfaceClass);

    /**
     * 关闭资源
     */
    void close();
}
