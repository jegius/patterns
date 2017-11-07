package headfirstpatterns.strategy.ducks.models.behaviors;

import headfirstpatterns.strategy.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
