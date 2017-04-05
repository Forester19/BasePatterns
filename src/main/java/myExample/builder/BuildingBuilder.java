package myExample.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public abstract class BuildingBuilder {
    Building building;
    public void createNewBuilding(){
        building = new Building();
    }
    abstract void buildName();
    abstract void buildType();
    abstract void buildPrice();

    Building getBuilding(){
        return building;
    }
}
