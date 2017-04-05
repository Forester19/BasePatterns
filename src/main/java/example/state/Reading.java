package example.state;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book ");
    }
}
