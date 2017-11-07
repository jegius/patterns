package headfirstpatterns.strategy.ducks.models.behaviors;

import headfirstpatterns.strategy.ducks.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
