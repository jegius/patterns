package patterns.creational.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }


    Website bildWebSite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCMS();
        builder.buildPrice();


        return builder.getWebsite();
    }
}
