package com.behavioral.pattern.strategy;

import com.behavioral.pattern.strategy.Impl.FlyNoWay;
import com.behavioral.pattern.strategy.Impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I am a Model Duck");
    }
}
