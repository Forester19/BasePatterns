package myExample.decorator;

/**
 * Created by Владислав on 03.04.2017.
 */
public class FirstSeller extends ManagerDecoratoe {
    public FirstSeller(Manager manager) {
        super(manager);
    }

    String sell(){
        return "First Seller sell smth...";

    }

    @Override
    public String sellSmth() {
        return super.sellSmth() + sell();
    }
}
