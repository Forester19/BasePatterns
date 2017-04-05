package example.observer;

import java.util.List;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void hendleEvent(List<String> vacansies) {
        System.out.println("Dear " + name + " vacansies" + vacansies +
        "\n=====================\n");
    }
}
