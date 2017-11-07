package headfirstpatterns.decorator.models;

public class Decat extends Beverage {
    Decat(){
        description = "Decat Coffee";
    }

    @Override
    public double cost() {
        return .71;
    }
}
