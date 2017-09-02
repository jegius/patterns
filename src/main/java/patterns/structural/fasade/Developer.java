package patterns.structural.fasade;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class Developer {
    public void doJobBeforeDearLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading habrahabr...");
        }
    }
}
