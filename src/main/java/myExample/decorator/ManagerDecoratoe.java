package myExample.decorator;

/**
 * Created by Владислав on 03.04.2017.
 */
public class ManagerDecoratoe implements Manager {

    Manager manager;

    public ManagerDecoratoe(Manager manager) {
        this.manager = manager;
    }

    public String sellSmth() {
        return manager.sellSmth();
    }
}
