package myExample.abstractFactory.buiding;

import myExample.abstractFactory.Manager;
import myExample.abstractFactory.TeamFactory;
import myExample.abstractFactory.Worker;

/**
 * Created by Владислав on 01.04.2017.
 */
public class BreakeBuildTeamFactory implements TeamFactory {
    public Manager getManager() {
        return new BuildManager();
    }

    public Worker getWorker() {
        return new BuildWorker();
    }
}
