package com.zkfzle.designPatterns;

import java.util.Observable;

/**
 * Created by zkfzle on 2017/5/1.
 */
public class WeatherDataUsingJDKimplents extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataUsingJDKimplents() {
    }

    public void measurementChanged() {
        // 主题在做过数据更新后，设置一下数据更新状态，执行通知所有观察者。
        // 这两个父类方法调用后，就不需要主题做其他的事情了。
        setChanged();
        notifyObservers();
    }

    // 主题的内部实现通过接口一定程度上暴露给了observers.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return  pressure;
    }
}
