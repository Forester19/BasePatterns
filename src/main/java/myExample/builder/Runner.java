package myExample.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilserbuilding(new LowLevelBuildingBuilder());
        System.out.println(director.buildBuilding());
    }
}
