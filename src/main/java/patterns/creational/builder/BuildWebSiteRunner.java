package patterns.creational.builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.bildWebSite();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website entWebsite = director.bildWebSite();

        System.out.println(website);
        System.out.println(entWebsite);
    }
}
