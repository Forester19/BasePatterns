package myExample.flyweight;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) {
ManagerFactory managerFactory = new ManagerFactory();

        ArrayList<Manager> managerList = new ArrayList<>();

        managerList.add(managerFactory.getManagerBySpecialty("one"));
        managerList.add(managerFactory.getManagerBySpecialty("one"));
        managerList.add(managerFactory.getManagerBySpecialty("one"));
        managerList.add(managerFactory.getManagerBySpecialty("one"));
        managerList.add(managerFactory.getManagerBySpecialty("one"));
        managerList.add(managerFactory.getManagerBySpecialty("one"));
        managerList.add(managerFactory.getManagerBySpecialty("two"));

        for (Manager m: managerList){
            m.sellCar();
        }
    }
}
