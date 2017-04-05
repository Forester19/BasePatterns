package myExample.itrator;

/**
 * Created by Владислав on 04.04.2017.
 */
public class StoreRunner {
    public static void main(String[] args) {
        String[] products = {"iPhone", "Mac pro rethina"};

        Store store = new Store("iStore",products);

        Iterator iterator = store.getIterator();

        System.out.println("Shop " + store.getName());
        System.out.println("Products ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
