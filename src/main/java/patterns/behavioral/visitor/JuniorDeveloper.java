package patterns.behavioral.visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop dataBase");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create not reliable tests");
    }
}
