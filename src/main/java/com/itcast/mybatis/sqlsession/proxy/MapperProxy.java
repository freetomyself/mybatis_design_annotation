package com.itcast.mybatis.sqlsession.proxy;

import com.itcast.mybatis.cfg.Mapper;
import com.itcast.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.sqlsession.proxy
 * @author: WaHotDog 2019-08-07 14:35
 **/


public class MapperProxy implements InvocationHandler {
    private Map<String,Mapper> mappers;
    private Connection conn;
    public MapperProxy(Map<String, Mapper> mappers, Connection conn) {
        this.mappers=mappers;
        this.conn = conn;
    }

    /**
     * 用于增强
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1获取方法名
        String methodName = method.getName();
        //2获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        //3组合key
        String key = className +"."+methodName;
        //4获取mapper中的Mapper对象
        Mapper mapper = mappers.get(key);
        //5判断是否有mapper
        if (mapper==null){
            throw new IllegalArgumentException("传入的参数有误");
        }
        //6调用工具类执行查询所有
        return new Executor().selectList(mapper,conn);
    }
}
