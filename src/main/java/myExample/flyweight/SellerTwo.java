package myExample.flyweight;

/**
 * Created by Владислав on 03.04.2017.
 */
public class SellerTwo implements Manager{
    @Override
    public void sellCar() {
        System.out.println("second seller sells car");
    }
}
