package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMaxIntValue = Integer.MAX_VALUE;
	    int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Overflow Max Value = " + (myMaxIntValue + 1));
        System.out.println("Underflow Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
    }
}
