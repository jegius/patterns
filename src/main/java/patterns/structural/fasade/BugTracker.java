package patterns.structural.fasade;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class BugTracker {

    private boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint in active.");
        activeSprint = true;
    }

    public void finishSpring(){
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
