package example.facade;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Developer {
    public void doJobBeforeDeadLone(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems");
        }else
            System.out.println("Developer is reading habrahabr");
    }
}
