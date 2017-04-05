package example.visitir;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
developer.create(this);
    }
}
