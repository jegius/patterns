package patterns.structural.bridge.programs;

import patterns.structural.bridge.developers.Developer;

public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Stock Exchange development in progress");
        developer.writeCode();
    }
}
