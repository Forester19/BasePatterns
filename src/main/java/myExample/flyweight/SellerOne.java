package myExample.flyweight;

/**
 * Created by Владислав on 03.04.2017.
 */
public class SellerOne implements Manager {
    @Override
    public void sellCar() {
        System.out.println("first seller sells car");
    }
}
