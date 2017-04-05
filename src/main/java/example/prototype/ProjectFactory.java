package example.prototype;

/**
 * Created by Владислав on 02.04.2017.
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
