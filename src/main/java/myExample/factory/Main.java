package myExample.factory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) {
                StaffFactory staffFactory = createStaffFactory("manger");
                Staff staff = staffFactory.createNewStaff();
                staff.doSometh();
    }
    public static StaffFactory createStaffFactory(String spec){
        if(spec.equalsIgnoreCase("worker")){
            return new WorkerStaffFactory();
        }else if (spec.equalsIgnoreCase("manger")){
            return new ManagerStaffFactory();
        }else throw new RuntimeException(spec + " does not found");
    }
}
