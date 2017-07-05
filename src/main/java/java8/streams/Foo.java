package java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ival0217 on 04.07.2017.
 */
public class Foo {

    private String name;
    List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
