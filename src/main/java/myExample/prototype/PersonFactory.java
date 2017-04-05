package myExample.prototype;

/**
 * Created by Владислав on 02.04.2017.
 */
public class PersonFactory {
    Person person;

    public PersonFactory(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    Person clonePerson(){
        return (Person) person.copy();
    }
}
