package example.memento;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import example.bridge.Program;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SaveProgectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();
        System.out.println( "Creating new project");
        project.setVersionToPRoject("1.0");
        System.out.println(project);
        System.out.println("Saving project to Github");

        githubRepo.setSave(project.save());
        System.out.println("Updating project to Version 1.0");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        project.setVersionToPRoject("1.1");
        System.out.println(project);
        System.out.println("Some thing went wrong..");
        System.out.println("Rolling back to Version 1.0");
        project.load(githubRepo.getSave());
        System.out.println( project);
    }
}
