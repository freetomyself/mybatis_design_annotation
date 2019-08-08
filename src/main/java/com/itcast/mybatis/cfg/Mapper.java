package com.itcast.mybatis.cfg;

/**
 * @program: day01_eesy_04mybatis_design1--com.itcast.mybatis.cfg
 * @author: WaHotDog 2019-08-07 11:40
 **/

/**
 * 用于封装执行的sql语句和结果类型的全限定类名
 */
public class Mapper {
    private String queryString;//SQL
    private String resultType;//实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
