package example.decorator;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveeloper());
        System.out.println(developer.makeJob());

    }
}
