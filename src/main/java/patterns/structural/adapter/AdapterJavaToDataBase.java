package patterns.structural.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {
    public void insert() {
        saveObject();
    }

    public void update() {
        updateObject();
    }

    public void select() {
        loadObject();
    }

    public void remove() {
        deleteObject();
    }
}
