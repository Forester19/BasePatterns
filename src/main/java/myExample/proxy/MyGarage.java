package myExample.proxy;

/**
 * Created by Владислав on 03.04.2017.
 */
public class MyGarage implements Garage {
    private String location;
    @Override
    public void open() {
        System.out.println("scanning the premise " + location +" ...");
    }
    public void opening(){
        System.out.println(" opening the garage  " + location +" ...");
    }

    public MyGarage(String location) {
        this.location = location;
        opening();
    }
}
