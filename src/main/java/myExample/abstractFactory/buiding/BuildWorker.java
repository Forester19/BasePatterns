package myExample.abstractFactory.buiding;

import myExample.abstractFactory.Worker;

/**
 * Created by Владислав on 01.04.2017.
 */
public class BuildWorker implements Worker {
    public void workSomth() {
        System.out.println("worker builds wall ");
    }
}
