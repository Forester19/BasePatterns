package example.chain;

/**
 * Created by Владислав on 04.04.2017.
 */
public class EmailNotify extends Notifier {
    public EmailNotify(int priority) {
        super(priority);
    }

    @Override
    protected void write(String text) {
        System.out.println("Sending email " + text + ".");
    }
}
