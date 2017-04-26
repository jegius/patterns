package patterns.structural.bridge.programs;

import patterns.structural.bridge.developers.Developer;

public class BankSystem extends Program{

    public BankSystem(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
