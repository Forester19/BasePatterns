package example.visitir;

/**
 * Created by Владислав on 04.04.2017.
 */
public class JunioDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class ");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database ");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test  ");
    }
}
