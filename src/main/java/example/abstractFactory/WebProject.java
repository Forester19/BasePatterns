package example.abstractFactory;

import example.abstractFactory.webSite.ComeTeamFactory;

/**
 * Created by Владислав on 01.04.2017.
 */
public class WebProject {
    public static void main(String[] args) {
        ProgectTeamFactory progectTeamFactory = new ComeTeamFactory();
        Developer developer = progectTeamFactory.getDeveloper();
        Tester tester = progectTeamFactory.getTeaster();
        ProgecrManager progecrManager = progectTeamFactory.getPM();

        System.out.println("creating site");
        developer.writeCode();
        tester.testCode();
        progecrManager.manageProject();
    }
}
