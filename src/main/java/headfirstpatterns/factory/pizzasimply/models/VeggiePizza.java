package headfirstpatterns.factory.pizzasimply.models;

public class VeggiePizza implements Pizza {
    private String name = "Veggie Pizza";
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
