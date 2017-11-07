package orealy.strategy.ducks.models.behaviors;

import orealy.strategy.ducks.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
