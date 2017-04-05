package example.decorator;

/**
 * Created by Владислав on 03.04.2017.
 */
public class DeveloperDcorator implements Developer{
Developer developer;

    public DeveloperDcorator(Developer developer) {
        this.developer = developer;
    }


    public String makeJob() {
        return developer.makeJob();
    }
}
