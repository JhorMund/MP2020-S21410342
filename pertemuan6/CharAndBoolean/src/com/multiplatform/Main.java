package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUcicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUcicodeChar);

        char myOtherUniCodeChar = '\u00A9';
        System.out.println(myOtherUniCodeChar);

        boolean myFirstBoolean = true;
        boolean mySeconBoolean = false;
        boolean isLoggedIn = true;

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("My String " + myString);
        myString = myString + ", this is more";
        System.out.println("My String " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("My String " + myString);

        String myNumberString = "50.25";
        System.out.println("40.75" + myNumberString);
        int myInt = 10;
        myNumberString = myNumberString + myInt;
        System.out.println(myNumberString);
    }
}
