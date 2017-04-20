package patterns.creational.FactoryMethod.factories;

import patterns.creational.FactoryMethod.Developer;
import patterns.creational.FactoryMethod.DeveloperFactory;
import patterns.creational.FactoryMethod.developers.CppDeveloper;

public class CppDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
