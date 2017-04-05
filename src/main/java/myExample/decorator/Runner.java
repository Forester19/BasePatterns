package myExample.decorator;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Manager manager = new FirstSeller(new Kasir());
        System.out.println(manager.sellSmth());
    }
}
