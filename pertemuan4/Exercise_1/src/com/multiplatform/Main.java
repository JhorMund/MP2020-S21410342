package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 8000;
        byte myBytevalue = 110;
        short myShortvalue = 150;
        long myLongvalue = 50000 + 10 * myBytevalue + myShortvalue + myIntValue;

        System.out.println("Hasil Dari Value Tersebut Adalah = " + myLongvalue);
    }
}
