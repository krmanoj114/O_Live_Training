package com.behavioral.pattern.strategy.Impl;

import com.behavioral.pattern.strategy.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
