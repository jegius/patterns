package patterns.behavioral.interpretator;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean intepret(String context) {
        if (context.contains(data)) {
            return true;
        } else {
            return false;
        }
    }
}
