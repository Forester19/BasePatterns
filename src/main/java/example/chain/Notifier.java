package example.chain;

/**
 * Created by Владислав on 04.04.2017.
 */
public abstract class Notifier {
    private int priority;
    private Notifier notifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.notifier = nextNotifier;
    }

    public void notifyManager(String text, int level) {
        if (level >= priority) write(text);
        if (notifier != null) {
            notifier.notifyManager(text, level);
        }

    }

    protected abstract void write(String text);
}
