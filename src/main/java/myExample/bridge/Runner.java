package myExample.bridge;

import java.util.ArrayList;

/**
 * Created by Владислав on 02.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Shop manager[] = {
                new ShoeShop(new HighLevelSeller()),
                new GroceryStore( new LowLevelSeller())
        };
        for (Shop s: manager){
            s.creatingShop();
        }
    }
}
