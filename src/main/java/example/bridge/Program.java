package example.bridge;

/**
 * Created by Владислав on 02.04.2017.
 */
public abstract class Program {
    Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }
    public abstract void developProgaram();
}
