package headfirstpatterns.strategy.ducks;

import headfirstpatterns.strategy.ducks.models.Duck;
import headfirstpatterns.strategy.ducks.models.MallardDuck;
import headfirstpatterns.strategy.ducks.models.ModelDuck;
import headfirstpatterns.strategy.ducks.models.behaviors.FlyRocketPowered;

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
