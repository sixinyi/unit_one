package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a negative decimal number: ");
        double result1=inp.nextDouble();


        int result=(int)(result1-0.5);
        System.out.println(result);
        System.out.println(result1+" rounded to a whole number is "+result);
    }
}