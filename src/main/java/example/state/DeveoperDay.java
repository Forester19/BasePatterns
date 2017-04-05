package example.state;

/**
 * Created by Владислав on 04.04.2017.
 */
public class DeveoperDay {
    public static void main(String[] args) {
        Activity activity = new Sleepeing();
        Developer developer = new Developer();
        developer.setActivity(activity);

        for (int i=0; i<10; i++ ){
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
