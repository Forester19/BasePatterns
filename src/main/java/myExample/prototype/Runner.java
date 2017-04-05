package myExample.prototype;

/**
 * Created by Владислав on 02.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Person person = new Person("sef",3,"esfef");

        System.out.println(person);

        PersonFactory personFactory = new PersonFactory(person);
        System.out.println(personFactory.clonePerson());
    }
}
