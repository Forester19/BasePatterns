package myExample.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Владислав on 03.04.2017.
 */
public class ManagerFactory {
    private Map<String, Manager> managerMap = new HashMap<>();

    Manager getManagerBySpecialty(String spec){

        Manager manager = managerMap.get(spec);

        if (manager ==null){
            if (spec.equalsIgnoreCase("one")){
                manager = new SellerOne();
                System.out.println("ffirst seller do it");
            }else {
                manager = new SellerTwo();
                System.out.println("second seller do it");
            }
        }
        return manager;

    }
}
