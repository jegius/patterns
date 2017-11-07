package orealy.strategy.ducks.models.behaviors;

import orealy.strategy.ducks.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
