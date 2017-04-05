package example.observer;

/**
 * Created by Владислав on 04.04.2017.
 */
public interface Observed {
    void addObserver(Observer observed);
    void removeObserver(Observer observed);
    void notifyObservers();
}
