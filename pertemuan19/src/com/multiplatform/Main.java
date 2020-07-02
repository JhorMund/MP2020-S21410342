package com.multiplatform;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        new Car().startEngine();
        new Car().accelerate();
        new Car().brake();

        Car Datsun = new Datsun("T MT", 4);
        System.out.println(Datsun.getName() + " has " + Datsun.getCylinders() + " cylinders.");
        Datsun.startEngine();
        Datsun.accelerate();
        Datsun.brake();

        Car Avanza = new Avanza("E MT", 5);
        System.out.println(Avanza.getName() + " has " + Avanza.getCylinders() + " cylinders.");
        Avanza.startEngine();
        Avanza.accelerate();
        Avanza.brake();

        Car Suzuki = new Suzuki("Ertiga", 6);
        System.out.println(Suzuki.getName() + " has " + Suzuki.getCylinders() + " cylinders.");
        Suzuki.startEngine();
        Suzuki.accelerate();
        Suzuki.brake();
    }
}
