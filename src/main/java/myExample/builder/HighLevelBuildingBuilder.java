package myExample.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class HighLevelBuildingBuilder extends BuildingBuilder {
    void buildName() {
        building.setName("High-rise");
    }

    void buildType() {
           building.setType(Type.BRICK);
    }

    void buildPrice() {
building.setPrice(20000);
    }
}
