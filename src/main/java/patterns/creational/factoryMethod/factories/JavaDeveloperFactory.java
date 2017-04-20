package patterns.creational.factoryMethod.factories;

import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.DeveloperFactory;
import patterns.creational.factoryMethod.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
