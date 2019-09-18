package com.company;

import java.util.Scanner;

public class FindTheAverage {
    public static void main(String[] args){
        Scanner enterv= new Scanner(System.in);
        System.out.println("Enter four values.");
        System.out.println("Value 1");
        double v1=enterv.nextDouble();
        System.out.println("Value 2");
        double v2=enterv.nextDouble();
        System.out.println("Value 3");
        double v3=enterv.nextDouble();
        System.out.println("Value 4");
        double v4=enterv.nextDouble();
        double outcome=0;
        outcome += v1;
        outcome += v2;
        outcome += v3;
        outcome += v4;
        System.out.println("Average = "+ outcome);
    }
}
