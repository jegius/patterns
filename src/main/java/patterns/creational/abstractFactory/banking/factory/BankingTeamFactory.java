package patterns.creational.abstractFactory.banking.factory;

import patterns.creational.abstractFactory.Developer;
import patterns.creational.abstractFactory.Manager;
import patterns.creational.abstractFactory.ProjectTeamFactory;
import patterns.creational.abstractFactory.Tester;
import patterns.creational.abstractFactory.banking.employees.JavaDeveloper;
import patterns.creational.abstractFactory.banking.employees.ProjectManager;
import patterns.creational.abstractFactory.banking.employees.QaTester;

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
