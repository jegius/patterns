package orealy.strategy.ducks.models.behaviors;

import orealy.strategy.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
