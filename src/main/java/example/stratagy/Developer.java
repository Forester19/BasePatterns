package example.stratagy;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Developer  {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void execActivity(){
        activity.justDoIT();
    }
}