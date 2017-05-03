package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<Developer>();


    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void revmoveDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Team crate Project");

        for (Developer developer : developers){
            developer.writeCode();
        }
    }
}
