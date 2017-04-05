package example.composite;

import java.util.ArrayList;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Team {
    private ArrayList<Developer> developers = new ArrayList<Developer>();
    public void  addDev(Developer developer){
        developers.add(developer);
    }
    public void  removeDev(Developer developer){
        developers.remove(developer);
    }
    public void createProject(){
        System.out.println("team created project ...");
        for (Developer developer:developers){
            developer.writeCodes();
        }
    }

}
