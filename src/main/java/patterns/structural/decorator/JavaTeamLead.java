package patterns.structural.decorator;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    private String sendWeekReport(){
        return "send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
