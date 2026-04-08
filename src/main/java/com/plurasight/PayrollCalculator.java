package com.plurasight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        //Ask user for name
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = myScanner.nextLine();

        //Ask user their hours worked
        System.out.print("How many hours did you work?: ");
        double hourWorked = myScanner.nextDouble();

        //Ask user for pay rate

        System.out.print("How much do you get paid: ");
        double payRate = myScanner.nextDouble();

        //Calculate the users gross pay


    }
}
