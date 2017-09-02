package patterns.structural.Proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url){
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void Run() {
        System.out.println("Running project " + url + "...");
    }
}
