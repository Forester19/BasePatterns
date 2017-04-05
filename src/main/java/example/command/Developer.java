package example.command;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void inserRecord(){
        insert.execut();
    }

    public void updateRecord(){
        update.execut();
    }

    public void selectRecord(){
        select.execut();
    }

    public void deleteRecord(){
        delete.execut();
    }

}
