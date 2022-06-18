package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C08IncomeTaxCalculator {
    public static void main(String[] args) {
        System.out.print("Enter your yearly income: ");
        Scanner input = new Scanner(System.in);

        double income = input.nextInt();

        double taxableIncome = income - 300_000; // no tax till 300_000

        double tax;

        if (taxableIncome <= 100_000) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= (100_000 + 300_000)) {
            tax = (100_000 * 0.05)
                    + ((taxableIncome - 100_000) * 0.10);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000)) {
            tax = (100_000 * 0.05)
                    + (300_000 * 0.10)
                    + ((taxableIncome - (100_000 + 300_000)) * 0.15);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000 + 500_000)) {
            tax = (100_000 * 0.05)
                    + (300_000 * 0.10)
                    * (400_000 * 0.15)
                    + ((taxableIncome - (100_000 + 300_000 + 400_000)) * 0.20);
        } else {
            tax = (100_000 * 0.05)
                    + (300_000 * 0.10)
                    * (400_000 * 0.15)
                    + (500_000 * 0.20)
                    + ((taxableIncome - (100_000 + 300_000 + 400_000 + 500_000)) * 0.25);
        }
        System.out.println("Your tax is: " + tax);
    }
}
