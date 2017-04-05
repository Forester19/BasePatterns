package example.command;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execut() {
        database.select();
    }
}
