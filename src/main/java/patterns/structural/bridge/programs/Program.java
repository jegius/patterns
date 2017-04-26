package patterns.structural.bridge.programs;

import patterns.structural.bridge.developers.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer = developer;
    }

    public abstract void  developProgram();
}
