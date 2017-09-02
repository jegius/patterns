package patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Maven", "SQL", "Hibernate", "Spring"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Ivan Alekseev", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
