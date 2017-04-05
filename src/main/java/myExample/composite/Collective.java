package myExample.composite;

import java.util.ArrayList;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Collective {
    private ArrayList<Manager> managers = new ArrayList<Manager>();

    public void addManager(Manager manager){
      managers.add(manager);
    }
    public void removeManager(Manager manager){
        managers.add(manager);
    }
    public void createStore(){
        System.out.println("Creating shop");
        for (Manager m: managers) m.sell();
    }
}
