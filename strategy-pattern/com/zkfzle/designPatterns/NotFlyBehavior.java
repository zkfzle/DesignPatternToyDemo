package com.zkfzle.designPatterns;

/**
 * Created by zkfzle on 2017/2/26.
 */
public class NotFlyBehavior implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
