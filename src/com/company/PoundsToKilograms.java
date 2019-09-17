package com.company;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        final double KG_TO_LBS=2.205;
        Scanner k= new Scanner(System.in);
        System.out.println("type Pounds in number");

        double lbs=k.nextDouble();
        double kg=lbs/KG_TO_LBS;
        System.out.print("pounds = "+kg+" kilograms");
    }
}