package com.itcast.mybatis.io;

import java.io.InputStream;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.io
 * @author: WaHotDog 2019-08-07 10:01
 **/


public class Resources {
    /**
     * 根据传入参数获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
