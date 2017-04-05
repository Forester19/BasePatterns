package example.visitir;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Progect implements ProjectElement {
    ProjectElement[] projectElements;

    public Progect() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
for (ProjectElement p: projectElements){
        p.beWritten(developer);
}
    }
}
