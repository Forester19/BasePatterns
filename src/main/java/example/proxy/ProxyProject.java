package example.proxy;

/**
 * Created by Владислав on 03.04.2017.
 */
public class ProxyProject implements Progect {

    private String url;

    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
