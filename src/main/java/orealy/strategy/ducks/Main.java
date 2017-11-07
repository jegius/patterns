package orealy.strategy.ducks;

import orealy.strategy.ducks.models.Duck;
import orealy.strategy.ducks.models.MallardDuck;
import orealy.strategy.ducks.models.ModelDuck;
import orealy.strategy.ducks.models.behaviors.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        duck.performFly();
        duck.performQuack();
        duck.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
