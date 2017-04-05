package myExample.factory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class WorkerStaffFactory implements StaffFactory {
    public Staff createNewStaff() {
        return new Worker();
    }
}
