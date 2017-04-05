package example.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public class Bank extends Program {
    public Bank(Developer developer) {
        super(developer);
    }

    public void developProgaram() {
        System.out.println("developing bank");
        developer.writeCode();
    }
}
