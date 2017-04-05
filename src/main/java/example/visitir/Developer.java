package example.visitir;

import example.command.*;
import example.composite.Team;

import java.util.Date;

/**
 * Created by Владислав on 04.04.2017.
 */
public interface Developer{
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
