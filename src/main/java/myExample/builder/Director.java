package myExample.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class Director {
    BuildingBuilder builserbuilding;

    public void setBuilserbuilding(BuildingBuilder builserbuilding) {
        this.builserbuilding = builserbuilding;
    }

    Building buildBuilding(){
        builserbuilding.createNewBuilding();
        builserbuilding.buildName();
        builserbuilding.buildPrice();
        builserbuilding.buildType();

        Building building =builserbuilding.getBuilding();
        return building;
    }
}
