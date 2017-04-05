package example.command;

/**
 * Created by Владислав on 04.04.2017.
 */
public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execut() {
        database.insert();

    }
}
