package myExample.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class LowLevelBuildingBuilder  extends BuildingBuilder{
    void buildName() {
        building.setName("low-rise");
    }

    void buildType() {
   building.setType(Type.WOODEN);
    }

    void buildPrice() {
     building.setPrice(10000);
    }
}
