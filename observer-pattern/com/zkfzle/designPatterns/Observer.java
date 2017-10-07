package com.zkfzle.designPatterns;

/**
 * Created by zkfzle on 2017/5/1.
 */
public interface Observer {
    // 实现一，所有的observer获取数据都是通过统一的接口来进行
    public void update(float temp, float humidity, float pressure);
    // 实现二，
}
