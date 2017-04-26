package patterns.structural.bridge;

import patterns.structural.bridge.developers.CppDeveloper;
import patterns.structural.bridge.developers.JavaDeveloper;
import patterns.structural.bridge.programs.BankSystem;
import patterns.structural.bridge.programs.Program;
import patterns.structural.bridge.programs.StockExchange;

public class ProgramCreater {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new BankSystem(new CppDeveloper()),
                new StockExchange(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }
    }
}
