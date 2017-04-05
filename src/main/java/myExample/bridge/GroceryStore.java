package myExample.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public class GroceryStore extends Shop {
    public GroceryStore(Manager manager) {
        super(manager);
    }

    void creatingShop() {
        System.out.println("grocery store");
        manager.sellSomth();
    }
}
