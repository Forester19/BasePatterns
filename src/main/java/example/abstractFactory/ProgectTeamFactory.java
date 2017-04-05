package example.abstractFactory;

/**
 * Created by Владислав on 01.04.2017.
 */
public interface ProgectTeamFactory {
    Developer getDeveloper();
    Tester getTeaster();
    ProgecrManager getPM();
}
