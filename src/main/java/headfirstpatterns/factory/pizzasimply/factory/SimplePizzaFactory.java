package headfirstpatterns.factory.pizzasimply.factory;

import headfirstpatterns.factory.pizzasimply.models.*;

import static headfirstpatterns.factory.pizzasimply.enums.Constants.*;

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
