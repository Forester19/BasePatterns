package example.state;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(){
        if (activity instanceof Sleepeing){
            setActivity(new Treining());
        }else if (activity instanceof Treining){
            setActivity(new Coding());
        }else if (activity instanceof  Coding){
            setActivity(new Reading());
        }else if (activity instanceof  Reading) setActivity(new Sleepeing());
    }
    public void justDoIt(){
        activity.justDoIt();
    }
}
