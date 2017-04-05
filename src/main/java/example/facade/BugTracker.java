package example.facade;

/**
 * Created by Владислав on 03.04.2017.
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public  void startSprint(){
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public  void stopSprint(){
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
