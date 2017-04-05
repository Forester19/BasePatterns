package myExample.abstractFactory.buiding;

import myExample.abstractFactory.Manager;

/**
 * Created by Владислав on 01.04.2017.
 */
public class BuildManager implements Manager {
    public void controllSomth() {
        System.out.println("manager controls building");
    }
}
