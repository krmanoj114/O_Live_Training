package com.behavioral.pattern.strategy.Impl;

import com.behavioral.pattern.strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
