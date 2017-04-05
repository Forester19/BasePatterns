package example.abstractFactory.webSite;

import example.abstractFactory.ProgecrManager;

/**
 * Created by Владислав on 01.04.2017.
 */
public class WebPM implements ProgecrManager {
    public void manageProject() {
        System.out.println("manages web site");
    }
}
