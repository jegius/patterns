package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating auction website...");

        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
