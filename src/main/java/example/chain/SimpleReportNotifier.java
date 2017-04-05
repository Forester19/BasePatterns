package example.chain;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SimpleReportNotifier extends  Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    protected void write(String text) {
        System.out.println("Notifying using simple report ... "  + text);
    }
}
