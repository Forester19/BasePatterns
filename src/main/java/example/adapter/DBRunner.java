package example.adapter;

/**
 * Created by Владислав on 02.04.2017.
 */
public class DBRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();


        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
