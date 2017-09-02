package patterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        getHubRepo getHubRepo = new getHubRepo();

        System.out.println("Creating new Project. Version: 1.0");
        project.setVersionAndDate("Version: 1.0");

        System.out.println(project);

        System.out.println("Saving current version on github.");

        getHubRepo.setSave(project.save());

        System.out.println("Updating project to version: 1.0");
        System.out.println("writing poor code...");

        project.setVersionAndDate("version: 1.1");
        System.out.println(project);

        System.out.println("Something vent wrong...");
        System.out.println("Rollback to version: 1.0");

        project.load(getHubRepo.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
