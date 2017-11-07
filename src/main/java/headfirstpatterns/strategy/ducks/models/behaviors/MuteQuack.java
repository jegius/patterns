package headfirstpatterns.strategy.ducks.models.behaviors;

import headfirstpatterns.strategy.ducks.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
