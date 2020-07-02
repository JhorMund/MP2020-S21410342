package com.multiplatform;

public class Datsun extends Car{

    public Datsun(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine() {
        System.out.println("Datsun Telah Menyala");
    }

    public void accelerate() {
        System.out.println("Datsun Menerima Akselerasi");
    }

    public void brake() {
        System.out.println("Datsun Telah Berhenti, Pengereman Di Pakai");
    }

}
