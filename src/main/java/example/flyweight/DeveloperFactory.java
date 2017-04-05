package example.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Владислав on 03.04.2017.
 */
public class DeveloperFactory  {
    private static  final HashMap<String,Developer> developers = new HashMap<String, Developer>();

    public Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developers.get(specialty);
        if (developer == null){
            switch (specialty){
                case "java": {
                    developer = new JavaDeveloper();
                    System.out.println("Hiring java developer");
                } case "c++": {
                    developer = new CppDedeloper();
                    System.out.println("Hiring c++ developer");
                }
            }
             developers.put(specialty, developer);
        }
        return  developer;
    }
}
