package example.composite;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJava = new JavaDeveloper();
        Developer secondJava = new JavaDeveloper();
        Developer cppDev = new CppDeveloper();

        team.addDev(firstJava);
        team.addDev(secondJava);
        team.addDev(cppDev);
        team.createProject();
    }
}
