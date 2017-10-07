package com.zkfzle.designPatterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck = new RocketDuck();
        duck.performFly();
        duck.setFlyBehavior(new NotFlyBehavior());
        duck.performFly();
    }
}
