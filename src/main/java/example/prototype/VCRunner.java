package example.prototype;

/**
 * Created by Владислав on 02.04.2017.
 */
public class VCRunner {
    public static void main(String[] args) {
        Project project = new Project(1,"Super","SourceCode");
        System.out.println(project);

        ProjectFactory factory = new ProjectFactory(project);
        Project clone = factory.cloneProject();
        System.out.println(clone);
    }
}
