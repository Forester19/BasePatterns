package example.abstractFactory.bancing;

import example.abstractFactory.Developer;
import example.abstractFactory.ProgecrManager;
import example.abstractFactory.ProgectTeamFactory;
import example.abstractFactory.Tester;

/**
 * Created by Владислав on 01.04.2017.
 */
public class BreakingTeamFactory implements ProgectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTeaster() {
        return new QATester();
    }

    public ProgecrManager getPM() {
        return new PM();
    }
}
