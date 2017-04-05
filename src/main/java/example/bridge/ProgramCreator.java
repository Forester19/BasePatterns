package example.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public class ProgramCreator {
    public static void main(String[] args) {
              Program program[] = {
                new Bank(new JavaDeveloper()),
                new Stock(new CppDeveloper())
              };
              for (Program p: program){
                  p.developProgaram();
              }
    }
}
