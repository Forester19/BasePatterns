package myExample.proxy;

/**
 * Created by Владислав on 03.04.2017.
 */
public class ProxyGarage implements Garage {
    private String location;
    private MyGarage myGarage;

    public ProxyGarage(String location) {
        this.location = location;
    }


    @Override
    public void open() {
        if (myGarage == null){
            myGarage = new MyGarage(location);
        }
        myGarage.open();

    }
}
