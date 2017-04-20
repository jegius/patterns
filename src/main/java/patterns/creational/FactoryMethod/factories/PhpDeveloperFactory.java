package patterns.creational.FactoryMethod.factories;

import patterns.creational.FactoryMethod.Developer;
import patterns.creational.FactoryMethod.DeveloperFactory;
import patterns.creational.FactoryMethod.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
