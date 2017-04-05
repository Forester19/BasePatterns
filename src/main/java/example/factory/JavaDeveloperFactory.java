package example.factory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createNewDeveloper() {
        return new JavaDeveloper();
    }
}
