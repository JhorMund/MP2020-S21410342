package com.multiplatform;

public class Avanza  extends Car{

    public Avanza(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine() {
        System.out.println("Avanza Telah Menyala");
    }

    public void accelerate() {
        System.out.println("Avanza Menerima Akselerasi");
    }

    public void brake() {
        System.out.println("Avanza Telah Berhenti, Pengereman Di Pakai");
    }

}
