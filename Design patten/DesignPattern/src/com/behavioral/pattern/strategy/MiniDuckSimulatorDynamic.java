package com.behavioral.pattern.strategy;


import com.behavioral.pattern.strategy.Impl.FlyRocketPowered;

public class MiniDuckSimulatorDynamic {
        public static void main(String[] args) {
            Duck mallard = new MallardDuck();
            mallard.performFly();
            mallard.performQuack();

            Duck model = new ModelDuck();
            model.performFly();
            model.setFlyBehavior(new FlyRocketPowered());
            model.performFly();
        }
    }


