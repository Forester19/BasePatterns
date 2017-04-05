package example.facade;

/**
 * Created by Владислав on 03.04.2017.
 */
public class Workflow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void doIt(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLone(bugTracker);
    }
}
