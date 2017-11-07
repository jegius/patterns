package orealy.factory.newPizzaSimply.models.californiya;

import orealy.factory.newPizzaSimply.models.Pizza;
import orealy.factory.newPizzaSimply.models.PizzaStore;

import static orealy.factory.pizzasimply.enums.Constants.*;

public class CAPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case CHEESE_PIZZA: {
                return new CAStyleCheesePizza();
            }
            case PEPPERONI_PIZZA: {
                return new CAPeperoniPizza();
            }
            case CLAM_PIZZA: {
                return new CAClamPizza();
            }
            case VEGGIE_PIZZA:{
                return new CAVeggiePizza();
            }
        }

        return null;
    }
}
