package myExample.facade;

import myExample.adapter.*;

/**
 * Created by Владислав on 03.04.2017.
 */
public class SellingSpace {
    Seller seller = new Seller();
    Selling selling = new Selling();
    SellingActivator sellingActivator = new SellingActivator();

    public void justDoIt(){
        sellingActivator.activeSelling();
        selling.doSell();
        seller.doSell(sellingActivator);
    }

}
