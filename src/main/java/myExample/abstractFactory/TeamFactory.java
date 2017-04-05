package myExample.abstractFactory;

/**
 * Created by Владислав on 01.04.2017.
 */
public interface TeamFactory {
    Manager getManager();
    Worker getWorker();
}
