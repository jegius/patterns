package headfirstpatterns.strategy.ducks.models.behaviors;

import headfirstpatterns.strategy.ducks.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
