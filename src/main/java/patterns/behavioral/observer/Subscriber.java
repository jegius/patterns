package patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handelEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have a changes in vacancies: \n" + vacancies +
        "\n=======================================================================\n");
    }
}
