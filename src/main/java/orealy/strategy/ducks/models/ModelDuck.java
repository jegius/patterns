package orealy.strategy.ducks.models;

import orealy.strategy.ducks.models.behaviors.FlyNoWay;
import orealy.strategy.ducks.models.behaviors.MuteQuack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
