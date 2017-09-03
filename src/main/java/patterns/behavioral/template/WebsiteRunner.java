package patterns.behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate homePage = new HomePage();

        welcomePage.showPage();

        System.out.println("=============================================");

        homePage.showPage();
    }
}
