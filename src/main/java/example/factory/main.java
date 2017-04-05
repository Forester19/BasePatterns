package example.factory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class main {
    public static void main(String[] args) {
          DeveloperFactory developerFactory = createDeveloperFactory("php");
          Developer developer = developerFactory.createNewDeveloper();
          developer.writeCOde();
    }
    public static DeveloperFactory createDeveloperFactory(String spec){
        if (spec.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(spec.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }
        else throw new RuntimeException(spec + " is not found");

    }
}
