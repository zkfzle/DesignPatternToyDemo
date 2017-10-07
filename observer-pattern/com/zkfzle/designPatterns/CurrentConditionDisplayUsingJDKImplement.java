package com.zkfzle.designPatterns;

import java.util.*;

/**
 * Created by zkfzle on 2017/5/1.
 */
public class CurrentConditionDisplayUsingJDKImplement implements java.util.Observer, DisplayElements {
    Observable observable;
    private float tempture;
    private float humidity;

    public CurrentConditionDisplayUsingJDKImplement(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    // 观察者在实现了Observer接口后，主动从主题获取特有的需要数据
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataUsingJDKimplents) {
            WeatherDataUsingJDKimplents weatherData = (WeatherDataUsingJDKimplents) obs;
            this.tempture = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions : " + this.tempture + ", " + this.humidity);
    }
}
