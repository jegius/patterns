package headfirstpatterns.factory.newPizzaSimply.models;

public interface Pizza {
    void prepare();

    void bake();

    void cut();

    void box();
}
