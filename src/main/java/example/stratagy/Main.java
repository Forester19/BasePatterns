package example.stratagy;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.execActivity();

        developer.setActivity(new Training());
        developer.execActivity();

        developer.setActivity(new Coding());
        developer.execActivity();

        developer.setActivity(new Reading());
        developer.execActivity();
    }
}
