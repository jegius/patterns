package patterns.creational.factoryMethod.factories;

import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.DeveloperFactory;
import patterns.creational.factoryMethod.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
