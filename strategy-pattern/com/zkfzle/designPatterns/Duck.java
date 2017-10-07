package com.zkfzle.designPatterns;

/**
 * Created by zkfzle on 2017/2/26.
 */

// Duck基类不定义为abstract，如此一来不需要自类实现全部的接口。

abstract public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        // Duck类把相应的行为委托给了QuackBehavior引用的对象
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    abstract public void setFlyBehavior(FlyBehavior fb);

}
