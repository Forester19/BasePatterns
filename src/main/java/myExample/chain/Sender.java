package myExample.chain;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Sender {
    private int pririty;
    private Sender sender;

    public Sender(int pririty) {
        this.pririty = pririty;
    }

    public void setNextSender(Sender sender){
        this.sender = sender;
    }
}
