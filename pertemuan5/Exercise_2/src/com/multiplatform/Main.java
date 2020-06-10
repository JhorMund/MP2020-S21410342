package com.multiplatform;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pounds;
        double kilograms;

        Scanner input = new Scanner(System.in);

        System.out.println("masukan nomor dalam pounds");
        pounds =input.nextDouble();

        kilograms = pounds * 0.45359237;

        System.out.println(pounds + "adalah" + kilograms + "kilograms");
    }
}
