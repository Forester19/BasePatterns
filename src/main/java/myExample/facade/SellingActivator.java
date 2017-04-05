package myExample.facade;

/**
 * Created by Владислав on 03.04.2017.
 */
public class SellingActivator {
    private boolean activeSelling;

    public boolean isActiveSelling() {
        return activeSelling;
    }
    public void activeSelling(){
        System.out.println("selling is active");
    activeSelling = true;
    }

    public void disActiveSelling(){
        System.out.println("selling is not active");
        activeSelling = false;
    }
}
