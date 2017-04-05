package example.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public class Stock extends Program {

    public Stock(Developer developer) {
        super(developer);
    }

    public void developProgaram() {
        System.out.println("developing stock");
        developer.writeCode();
    }
}
