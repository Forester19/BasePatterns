package myExample.bridge;

import myExample.abstractFactory.*;

/**
 * Created by Владислав on 02.04.2017.
 */
public class LowLevelSeller implements Manager {
    public void sellSomth() {
        System.out.println("Low level manager sells ...");
    }
}
