package orealy.factory.newPizzaSimply.models.chicago;

import orealy.factory.newPizzaSimply.models.Pizza;
import orealy.factory.newPizzaSimply.models.PizzaStore;

import static orealy.factory.pizzasimply.enums.Constants.*;

public class CHPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case CHEESE_PIZZA: {
                return new CHStyleCheesePizza();
            }
            case PEPPERONI_PIZZA: {
                return new CHPeperoniPizza();
            }
            case CLAM_PIZZA: {
                return new CHClamPizza();
            }
            case VEGGIE_PIZZA:{
                return new CHVeggiePizza();
            }
        }

        return null;
    }
}
