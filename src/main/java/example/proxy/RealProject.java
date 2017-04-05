package example.proxy;

/**
 * Created by Владислав on 03.04.2017.
 */
public class RealProject implements Progect {
    public String url;

    public void load(){
        System.out.println("Loading project from " + url + " ...");
    }
    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + " ...");
    }
}
