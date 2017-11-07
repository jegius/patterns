package orealy.factory.newPizzaSimply.factory;

import orealy.factory.newPizzaSimply.models.*;

import static orealy.factory.pizzasimply.enums.Constants.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        switch (type){
            case CHEESE_PIZZA: {
                return new CheesePizza();
            }
            case PEPPERONI_PIZZA: {
                return new PepperoniPizza();
            }
            case CLAM_PIZZA:{
                return new ClamPizza();
            }
            case VEGGIE_PIZZA:{
                return new VeggiePizza();
            }
        }
        return null;
    }
}
