package com.company;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        System.out.println("type in the temperature in Fahrenheit");
        Scanner F = new Scanner(System.in);
        double Fahrenheit;
        double Celsius;
        Fahrenheit=F.nextDouble();
        Celsius=(Fahrenheit-32)/(1.8);
        System.out.println("Celsius = "+Celsius);
    }
}