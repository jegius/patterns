package patterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer juniorDeveloper = new JuniorDeveloper();
        Developer seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in action...");

        project.beWritten(juniorDeveloper);

        System.out.println("\n================================================\n");
        System.out.println("Senior In Action");

        project.beWritten(seniorDeveloper);
    }
}
