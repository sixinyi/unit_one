/* 9/23
We are going to work on the program can convert any number of cent into dollars, quarter, dimes, nickles, and cents.
by Wenxuan Yang ( Bruce )
*/
package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        System.out.println("Please enter a whole number of cents:");
        Scanner number_of_cents=new Scanner(System.in);
        //program below is converting the number of cents into charge.
        int input= number_of_cents.nextInt();
        int dollar= input/100;//number of dollar
        int restDollar= input%100;
        int quarter= restDollar/25;//number of quarter
        int restQuarter= restDollar%25;
        int dime= restQuarter/10;//number of dime
        int restDime= restQuarter%10;
        int nickel= restDime/5;//number of nickel
        int restNickel= restDime%5;
        int pennie= restNickel;//number of cent
        System.out.print("You have "+dollar+" dollars, "+quarter+" quarters, "+dime+" dims, "+nickel+" nickels"+pennie+" pennies.");

    }
}