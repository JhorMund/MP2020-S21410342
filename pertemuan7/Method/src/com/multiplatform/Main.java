package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        printMessage("Jhon");
        /*int res = addition(10, 20);*/
        int res = addition(0, 0);
        System.out.println("Result = " + res);
    }
    public static void printMessage(String name){
        System.out.println("Hello " + name);
    }
    public static int addition(int a, int b ){
        /*if (a == 0 ||(or) b == 0){
            return -1;
        }*/
        if (a == 0 && b == 0){
            return -1;
        }
        int result = a + b;
        return result;
    }
}
