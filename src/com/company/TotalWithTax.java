package com.company;

public class TotalWithTax {
    public static void main(String[] args) {
        final double TAXRATE= 0.0825;
        double price;
        double tax;
        double total;
        price=52.75;
        tax=price*TAXRATE;
        total=price+tax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}