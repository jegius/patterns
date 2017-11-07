package headfirstpatterns.strategy.ducks.models;

import headfirstpatterns.strategy.ducks.models.behaviors.FlyWithWings;
import headfirstpatterns.strategy.ducks.models.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm really mallard duck!");
    }
}
