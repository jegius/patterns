package patterns.behavioral.interpretator;

public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean intepret(String context) {
        return expression1.intepret(context) && expression2.intepret(context);
    }
}
