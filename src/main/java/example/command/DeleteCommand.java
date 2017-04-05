package example.command;

/**
 * Created by Владислав on 04.04.2017.
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execut() {
        database.delete();
    }
}
