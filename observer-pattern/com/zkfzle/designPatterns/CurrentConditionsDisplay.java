package com.zkfzle.designPatterns;

/**
 * Created by zkfzle on 2017/5/1.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElements {
    private float tempture;
    private float hummidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weathreData) {
        this.weatherData = weathreData;
        weathreData.registerObserver(this);
    }

    public void update(float tempture, float hummidity, float pressure) {
        this.tempture = tempture;
        this.hummidity = hummidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current Condition is " + this.tempture + ", " + this.hummidity + ", " + this.pressure);
    }
}
