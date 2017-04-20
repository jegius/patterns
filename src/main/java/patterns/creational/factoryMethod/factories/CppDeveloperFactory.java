package patterns.creational.factoryMethod.factories;

import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.DeveloperFactory;
import patterns.creational.factoryMethod.developers.CppDeveloper;

public class CppDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
