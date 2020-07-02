package com.multiplatform;

public class PC {
    private Case theCase;
    private Motherboard theMotherboard;
    private Monitor theMonitor;

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public PC(Case theCase, Motherboard theMotherboard, Monitor theMonitor) {
        this.theCase = theCase;
        this.theMotherboard = theMotherboard;
        this.theMonitor = theMonitor;
    }

    public void startPC(String programName){
//        theCase().pressPowerButton();
//        theMotherboard().loadProgram(programName);
    }
}