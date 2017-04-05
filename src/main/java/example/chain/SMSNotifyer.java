package example.chain;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SMSNotifyer extends Notifier {

    public SMSNotifyer(int priority) {
        super(priority);
    }

    @Override
    protected void write(String text) {
        System.out.println("Sending SMS to manager  " + text);
    }
}
