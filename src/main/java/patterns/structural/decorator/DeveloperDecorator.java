package patterns.structural.decorator;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
