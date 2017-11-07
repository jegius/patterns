package orealy.factory.newPizzaSimply.models.newyork;

import orealy.factory.newPizzaSimply.models.Pizza;

public class NYClamPizza implements Pizza {
    private String name = "New York Clam Pizza";

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

    }

    @Override
    public void bake() {
        System.out.println("baking "+ name);

    }

    @Override
    public void cut() {
        System.out.println("cutting "+ name);

    }

    @Override
    public void box() {
        System.out.println("boxing "+ name);

    }
}
