package patterns.structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/aiJegius");

        project.Run();

    }
}
