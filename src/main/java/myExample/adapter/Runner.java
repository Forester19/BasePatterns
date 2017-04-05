package myExample.adapter;

/**
 * Created by Владислав on 02.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Manager manager = new AdapterManagerToSeller();
        manager.buy();
        manager.doSmth();
        manager.sell();
    }
}
