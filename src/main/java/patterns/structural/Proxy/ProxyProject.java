package patterns.structural.Proxy;

public class ProxyProject implements Project{
    private String url;
    private Project realProject;

    public ProxyProject(String url){
        this.url = url;
    }


    @Override
    public void Run() {
        if (realProject == null){
            realProject = new RealProject(url);
        }
        realProject.Run();
    }
}
