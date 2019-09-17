package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        Scanner y= new Scanner(System.in);
        System.out.println("Type in the length in number: ");
        Double LENGTH = x.nextDouble();
        System.out.println("Type in the width in number: ");
        Double WIDTH = y.nextDouble();
        Double AREA= LENGTH*WIDTH;
        System.out.print("Area = "+AREA);
    }
}
