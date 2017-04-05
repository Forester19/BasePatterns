package example.prototype;

/**
 * Created by Владислав on 02.04.2017.
 */
public class Project implements Copyable{
    private int id;
    private String nameProject;
    private String sourceCode;

    public Project(int id, String nameProject, String sourceCode) {
        this.id = id;
        this.nameProject = nameProject;
        this.sourceCode = sourceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Object copy() {
        Project project = new Project(id,nameProject,sourceCode);
        return project;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", nameProject='" + nameProject + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
