package example.command;

import example.flyweight.*;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );
        developer.inserRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }

}
