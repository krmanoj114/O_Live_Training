package com.behavioral.pattern.strategy;

import com.behavioral.pattern.strategy.Impl.FlyWithWings;
import com.behavioral.pattern.strategy.Impl.Quack;

public class MallardDuck extends Duck {


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a real Mallard Duck");

    }
}
