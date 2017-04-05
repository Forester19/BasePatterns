package example.iterator;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        String[] sliks = {"fefsef", "fsefsef"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("frsfr",sliks);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println(javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
