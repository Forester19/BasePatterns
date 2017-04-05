package example.observer;

/**
 * Created by Владислав on 04.04.2017.
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("First java position");
        javaDeveloperJobSite.addVacancy("Second java developer");

        Observer firstSub = new Subscriber("Eugene");
        Observer secondSub = new Subscriber("Pieter");

        javaDeveloperJobSite.addObserver(firstSub);
        javaDeveloperJobSite.addObserver(secondSub);

        javaDeveloperJobSite.addVacancy("third java position ");
        }
    }

