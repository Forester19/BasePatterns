package example.visitir;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SenioDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting code ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test ");
    }
}
