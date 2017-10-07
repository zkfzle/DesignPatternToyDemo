package com.zkfzle.designPatterns;

/**
 * Created by zkfzle on 2017/2/26.
 */
public class RocketDuck extends Duck {
    FlyBehavior flyBehavior = new RocketFlyBehavior();
    // Quack是子类中不需要实现的行为，则不对基类的属性进行实现
    public void performFly() {
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }


}
