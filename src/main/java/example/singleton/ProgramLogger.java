package example.singleton;

/**
 * Created by Владислав on 01.04.2017.
 */
public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static  String logDile = " This logger  \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){

    }
    public void addLogIndo(String logInfo){
        logDile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logDile);
    }

}
