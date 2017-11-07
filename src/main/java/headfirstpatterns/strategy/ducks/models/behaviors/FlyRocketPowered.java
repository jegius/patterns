package headfirstpatterns.strategy.ducks.models.behaviors;

import headfirstpatterns.strategy.ducks.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
