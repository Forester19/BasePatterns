package myExample.proxy;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Garage garage = new ProxyGarage("biggest garage");
        garage.open();
    }
}
