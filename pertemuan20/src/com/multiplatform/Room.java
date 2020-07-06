package com.multiplatform;

public class Room {
    private Bed theBed;
    private Pillow thePillow;
    private ClothHanger theHanger;
    private Fan theFan;

    public Room(Bed theBed, Pillow thePillow, ClothHanger theHanger, Fan theFan) {
        this.theBed = theBed;
        this.thePillow = thePillow;
        this.theFan = theFan;
        this.theHanger = theHanger;
    }
    public void aboutRoom(String roomName){
        getTheBed().Sleep();
        getTheFan().Wind();
        getThePillow().Relax();
        getTheHanger().Hanger();
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Fan getTheFan() {
        return theFan;
    }

    public Pillow getThePillow() {
        return thePillow;
    }

    public ClothHanger getTheHanger() {
        return theHanger;
    }
}
