package example.decorator;

/**
 * Created by Владислав on 03.04.2017.
 */
public class SeniorJavaDeveloper extends DeveloperDcorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String makeCodeReview(){
        return "Make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+ makeCodeReview();
    }
}
