package myExample.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public abstract class Shop {
    Manager manager;

    public Shop(Manager manager) {
        this.manager = manager;
    }

    abstract void creatingShop();
}
