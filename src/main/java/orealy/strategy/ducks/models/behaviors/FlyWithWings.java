package orealy.strategy.ducks.models.behaviors;

import orealy.strategy.ducks.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
