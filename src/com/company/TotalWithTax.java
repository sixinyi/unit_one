package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args) {
        System.out.println("type in the price of the food");
        Scanner F = new Scanner(System.in);
        final double TAXRATE= 0.0825;
        double price;
        double tax;
        double total;
        price=F.nextDouble();
        tax=price*TAXRATE;
        total=price+tax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}