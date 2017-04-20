package patterns.creational.abstractFactory.website;

import patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Php developer write php code...");
    }
}
