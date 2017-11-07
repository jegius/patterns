package orealy.factory.newPizzaSimply.models;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.prepare();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
