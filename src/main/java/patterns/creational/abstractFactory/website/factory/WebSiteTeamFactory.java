package patterns.creational.abstractFactory.website.factory;

import patterns.creational.abstractFactory.Developer;
import patterns.creational.abstractFactory.Manager;
import patterns.creational.abstractFactory.ProjectTeamFactory;
import patterns.creational.abstractFactory.Tester;
import patterns.creational.abstractFactory.website.employees.ManualTester;
import patterns.creational.abstractFactory.website.employees.PhpDeveloper;
import patterns.creational.abstractFactory.website.employees.WebSitePM;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public Manager getManager() {
        return new WebSitePM();
    }
}
