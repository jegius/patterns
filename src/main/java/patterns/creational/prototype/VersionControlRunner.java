package patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "superProject", "sourceCode");

        System.out.println(master);

        System.out.println("=================================");

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println(masterClone);
    }
}
