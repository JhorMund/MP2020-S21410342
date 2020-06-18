package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // Class & Object
        Car toyota = new Car();
        toyota.setModel("Agya");
        System.out.println("model is " + toyota.getModel());

        Car daihatsu = new Car();
        daihatsu.setModel("xenia");
        System.out.println("Model is " + daihatsu.getModel());

        Car mitsubishi = new Car();
        mitsubishi.setModel("pajero");
        System.out.println("Model is " + mitsubishi.getModel());
    }
}
