package example.visitir;

import example.memento.Project;

/**
 * Created by Владислав on 04.04.2017.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Progect progect = new Progect();
        Developer jun = new JunioDeveloper();
        Developer sen = new SenioDeveloper();

     progect.beWritten(jun);
     progect.beWritten(sen);
    }
}
