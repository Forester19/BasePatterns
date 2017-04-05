package myExample.composite;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Collective collective = new Collective();

        Manager manager1 = new Seller();
        Manager manager2 = new Kasir();

        collective.addManager(manager1);
        collective.addManager(manager2);

        collective.createStore();
    }
}
