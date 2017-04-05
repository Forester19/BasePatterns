package myExample.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public class ShoeShop extends Shop {
    public ShoeShop(Manager manager) {
        super(manager);
    }

    void creatingShop() {
        System.out.println("shoe shop  ");
        manager.sellSomth();
    }
}
