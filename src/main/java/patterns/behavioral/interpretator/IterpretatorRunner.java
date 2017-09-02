package patterns.behavioral.interpretator;

public class IterpretatorRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.intepret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.intepret("Java Spring"));
    }
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression JavaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, JavaCore);

    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
