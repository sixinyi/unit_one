package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args) {
        System.out.print("Decimal number?");
        Scanner inp=new Scanner(System.in);
        double inpn = inp.nextDouble();
        double prog= inpn;
        prog *=10;
        prog +=0.5;
        int result=(int)(prog);
        double outcome= result /10;
        System.out.print(inpn+" rounded to the nearest tenth is "+outcome);
    }
}