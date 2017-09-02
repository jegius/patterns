package patterns.structural.decorator;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
