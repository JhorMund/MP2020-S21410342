package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value = " + myMinFloatValue);
        System.out.println("Maximum Float Value = " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum double Value = " + myMindoubleValue);
        System.out.println("Maximum double Value = " + myMaxdoubleValue);

        int myIntegerNumber = 5/3;
        float myFloatNumber = 5.00f/3.00f;
        double myDoubleNumber = 5.00d/3.00d;
        System.out.println(myIntegerNumber);
        System.out.println(myFloatNumber);
        System.out.println(myDoubleNumber);
    }
}
