package orealy.strategy.ducks.models.behaviors;

import orealy.strategy.ducks.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
