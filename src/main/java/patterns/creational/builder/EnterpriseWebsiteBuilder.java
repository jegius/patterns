package patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    void buildName() {
        website.setName("Enterprise website");
    }

    void buildCMS() {
        website.setCms(Cms.ALFRESCO);
    }

    void buildPrice() {
        website.setPrice(10000);
    }
}
