package myExample.facade;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Seller {

    public void doSell(SellingActivator sellingActivator){
        if (sellingActivator.isActiveSelling()){
            System.out.println("Seller do it .");
        }else
            System.out.println("Seller wait for starting");
    }
}
