package myExample.adapter;

import myExample.abstractFactory.*;

/**
 * Created by Владислав on 02.04.2017.
 */
public class AdapterManagerToSeller extends Seller implements Manager {
    public void buy() {
        toBuySmth();
    }

    public void sell() {
        toSellSmth();
    }

    public void doSmth() {
        toDoSmth();
    }
}
