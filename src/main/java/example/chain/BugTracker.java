package example.chain;

/**
 * Created by Владислав on 04.04.2017.
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNot = new SimpleReportNotifier(Priority.RUTINE);
        Notifier emailNot = new SimpleReportNotifier(Priority.IMPORTANT);
        Notifier smsNot = new SimpleReportNotifier(Priority.ASAP);

        reportNot.setNextNotifier(emailNot);
        emailNot.setNextNotifier(smsNot);

        reportNot.notifyManager("Ok", Priority.RUTINE);
        reportNot.notifyManager("Something went wrong ", Priority.IMPORTANT);
        reportNot.notifyManager("Houston, we've  had a problem here ..", Priority.ASAP);
    }
}
