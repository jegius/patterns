package patterns.creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    void buildName() {
       website.setName("Visit Card");
    }

    void buildCMS() {
        website.setCms(Cms.WORDPRESS);
    }

    void buildPrice() {
        website.setPrice(500);
    }
}
