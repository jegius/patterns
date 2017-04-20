package patterns.creational.abstractFactory.projects;

import patterns.creational.abstractFactory.Developer;
import patterns.creational.abstractFactory.Manager;
import patterns.creational.abstractFactory.ProjectTeamFactory;
import patterns.creational.abstractFactory.Tester;
import patterns.creational.abstractFactory.banking.factory.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();


        System.out.println("Creating bank system...");

        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
