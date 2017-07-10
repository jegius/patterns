package patterns.structural.decorator;

/**
 * Created by ival0217 on 10.07.2017.
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();

        Developer seniorJavaDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer javaTeamLead = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
        System.out.printf("%s", seniorJavaDeveloper.makeJob());
        System.out.printf("%s", javaTeamLead.makeJob());
    }
}
