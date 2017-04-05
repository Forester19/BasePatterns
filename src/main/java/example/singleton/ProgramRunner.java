package example.singleton;

/**
 * Created by Владислав on 01.04.2017.
 */
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogIndo("aefaefe");
        ProgramLogger.getProgramLogger().addLogIndo("aefaefe");
        ProgramLogger.getProgramLogger().addLogIndo("aefaefe");

        ProgramLogger.getProgramLogger().showLogFile();

    }
}
