package com.company;

import java.util.Scanner;

public class AddOneTakeOne {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner inp= new Scanner(System.in);
        double value= inp.nextByte();
        value--;
        System.out.print(value+" ");
        value++;
        System.out.print(value+" ");
        value++;
        System.out.print(value+" ");
    }
}