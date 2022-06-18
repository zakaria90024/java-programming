package com.gmail.shihab4t.chapter03;

import java.util.Scanner;

public class C34LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isDivisibleBy4 = year % 5 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        boolean isLeapYear = (isDivisibleBy4 && !isDivisibleBy100) || isDivisibleBy400;
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
