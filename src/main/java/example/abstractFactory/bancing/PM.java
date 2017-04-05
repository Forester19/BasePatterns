package example.abstractFactory.bancing;

import example.abstractFactory.ProgecrManager;

/**
 * Created by Владислав on 01.04.2017.
 */
public class PM implements ProgecrManager {
    public void manageProject() {
        System.out.println("PM manages app");
    }
}
