package patterns.creational.abstractFactory.website;

import patterns.creational.abstractFactory.Developer;
import patterns.creational.abstractFactory.Manager;
import patterns.creational.abstractFactory.ProjectTeamFactory;
import patterns.creational.abstractFactory.Tester;

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
