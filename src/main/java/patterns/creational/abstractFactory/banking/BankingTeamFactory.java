package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.Developer;
import patterns.creational.abstractFactory.Manager;
import patterns.creational.abstractFactory.ProjectTeamFactory;
import patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QaTester();
    }

    public Manager getManager() {
        return new ProjectManager();
    }
}
