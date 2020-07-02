package com.multiplatform;

public class Suzuki  extends Car{

    public Suzuki(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine() {
        System.out.println("Suzuki Telah Menyala");
    }

    public void accelerate() {
        System.out.println("Suzuki Menerima Akselerasi");
    }

    public void brake() {
        System.out.println("Suzuki Telah Berhenti, Pengereman Di Pakai");
    }

}
