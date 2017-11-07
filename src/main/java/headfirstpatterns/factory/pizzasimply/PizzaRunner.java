package headfirstpatterns.factory.pizzasimply;

import headfirstpatterns.factory.pizzasimply.factory.SimplePizzaFactory;
import headfirstpatterns.factory.pizzasimply.models.Pizza;
import headfirstpatterns.factory.pizzasimply.models.PizzaStore;

import static headfirstpatterns.factory.pizzasimply.enums.Constants.*;

public class PizzaRunner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        Pizza peperoi = pizzaStore.orderPizza(PEPPERONI_PIZZA);
        Pizza cheese = pizzaStore.orderPizza(CHEESE_PIZZA);
        Pizza clam = pizzaStore.orderPizza(CLAM_PIZZA);
        Pizza veggie = pizzaStore.orderPizza(VEGGIE_PIZZA);
    }
}
