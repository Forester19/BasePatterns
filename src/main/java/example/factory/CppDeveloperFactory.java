package example.factory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class CppDeveloperFactory implements DeveloperFactory {
    public Developer createNewDeveloper() {
        return new CppDeveloper();
    }
}
