package example.command;

import java.sql.DatabaseMetaData;

/**
 * Created by Владислав on 04.04.2017.
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execut() {
        database.update();
    }
}
