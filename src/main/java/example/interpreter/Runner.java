package example.interpreter;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Expression java = exprGetJavaExpression();
        Expression j2ee = exprGetJ2EEExpression();

        System.out.println(java.interpret("java"));
        System.out.println(j2ee.interpret("Java Spring"));

    }
    public static Expression exprGetJavaExpression(){
Expression expression = new TerminalExpression("java");
Expression expression2 = new TerminalExpression("java core");

return new OrExpression(expression,expression2);
    }


    public static Expression exprGetJ2EEExpression(){
    Expression expression = new TerminalExpression("java");
    Expression expression1 = new TerminalExpression("Spring");

    return new AndExpression(expression,expression1);
    }
}
