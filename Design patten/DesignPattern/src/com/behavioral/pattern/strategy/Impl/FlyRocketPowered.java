package com.behavioral.pattern.strategy.Impl;

import com.behavioral.pattern.strategy.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a Rocket");
    }
}
