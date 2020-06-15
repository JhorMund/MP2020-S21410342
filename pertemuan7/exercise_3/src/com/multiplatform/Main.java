package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mengembalikan Nilai = " + toMilesPerHour(1.5));
        System.out.println("Mengembalikan Nilai = " + toMilesPerHour(10.5));
        System.out.println("Mengembalikan Nilai = " + toMilesPerHour(-5.6));
        System.out.println("Mengembalikan Nilai = " + toMilesPerHour(25.42));
        System.out.println("Mengembalikan Nilai = " + toMilesPerHour(75.114));


        Main.printConversion(1.5);
        Main.printConversion(10.5);
        Main.printConversion(-5.6);
        Main.printConversion(25.42);
        Main.printConversion(75.114);


        double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("Bulatnya = " + rounded);
        System.out.println("dengan 3.9 = " + Math.round(3.9));
        System.out.println("dengan 4.5 = " + Math.round(4.5));
        int sum = 45;
        int count = 10;
        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("Rata - Rata = " + average);
        System.out.println("Bulat Rata - Ratanya = " + roundedAverage);

    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }
    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Tidak Ada Nilai");
        } else {
            long milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ milesPerHours +" mi/h");
        }
    }
}
