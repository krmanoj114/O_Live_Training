package com.behavioral.pattern.strategy.Impl;

import com.behavioral.pattern.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly !!");
    }
}
