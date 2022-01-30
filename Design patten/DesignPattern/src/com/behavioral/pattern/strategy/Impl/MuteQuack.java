package com.behavioral.pattern.strategy.Impl;

import com.behavioral.pattern.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
