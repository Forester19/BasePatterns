package myExample.abstractFactory;

import myExample.abstractFactory.buiding.BreakeBuildTeamFactory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class BuildingHotel {
    public static void main(String[] args) {
        BreakeBuildTeamFactory breakeBuildTeamFactory = new BreakeBuildTeamFactory();
        Manager manager = breakeBuildTeamFactory.getManager();
        Worker worker = breakeBuildTeamFactory.getWorker();

        System.out.println("starting building");
        worker.workSomth();
        manager.controllSomth();
    }
}
