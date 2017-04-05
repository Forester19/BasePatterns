package example.interpreter;

/**
 * Created by Владислав on 04.04.2017.
 */
public class AndExpression  implements Expression{
  private Expression exception1;
   private Expression exception2;

    public AndExpression(Expression exception1, Expression exception2) {
        this.exception1 = exception1;
        this.exception2 = exception2;
    }

    @Override
    public boolean interpret(String context) {
        return exception1.interpret(context) && exception2.interpret(context);
    }
}
