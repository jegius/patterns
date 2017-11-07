package orealy.factory.newPizzaSimply.models.newyork;

import orealy.factory.newPizzaSimply.models.Pizza;
import orealy.factory.newPizzaSimply.models.PizzaStore;

import static orealy.factory.pizzasimply.enums.Constants.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case CHEESE_PIZZA: {
                return new NYStyleCheesePizza();
            }
            case PEPPERONI_PIZZA: {
                return new NYPeperoniPizza();
            }
            case CLAM_PIZZA: {
                return new NYClamPizza();
            }
            case VEGGIE_PIZZA:{
                return new NYVeggiePizza();
            }
        }

        return null;
    }
}
