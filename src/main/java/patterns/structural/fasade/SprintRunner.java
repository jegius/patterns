package patterns.structural.fasade;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class SprintRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//
//        Developer developer = new Developer();
//        developer.doJobBeforeDearLine(bugTracker);
//
//        bugTracker.finishSpring();
//
//        developer.doJobBeforeDearLine(bugTracker);

        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
    }
}
