package example.interpreter;

/**
 * Created by Владислав on 04.04.2017.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data))return true;
        else return false;
    }
}
