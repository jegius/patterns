package patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixed Database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable tests");
    }
}
