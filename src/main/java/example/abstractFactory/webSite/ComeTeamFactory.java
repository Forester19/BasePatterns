package example.abstractFactory.webSite;

import example.abstractFactory.Developer;
import example.abstractFactory.ProgecrManager;
import example.abstractFactory.ProgectTeamFactory;
import example.abstractFactory.Tester;

/**
 * Created by Владислав on 01.04.2017.
 */
public class ComeTeamFactory implements ProgectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTeaster() {
        return new ManualTester();
    }

    public ProgecrManager getPM() {
        return new WebPM();
    }
}
