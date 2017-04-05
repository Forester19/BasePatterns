package example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 04.04.2017.
 */
public class JavaDeveloperJobSite implements Observed {
    List<String> vac = new ArrayList<>();
    List<Observer> sub = new ArrayList<>();

    public void addVacancy(String vac){
        this.vac.add(vac);
        notifyObservers();
    }
    public void removeVac(String vac){
        this.vac.remove(vac);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observed) {
this.sub.add(observed);
    }

    @Override
    public void removeObserver(Observer observed) {
this.sub.remove(observed);
    }

    @Override
    public void notifyObservers() {
for (Observer observer: sub){
    observer.hendleEvent(vac);
}
    }
}
