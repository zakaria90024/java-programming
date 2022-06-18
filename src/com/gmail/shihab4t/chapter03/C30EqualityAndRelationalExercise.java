package com.gmail.shihab4t.chapter03;

import java.util.Scanner;

public class C30EqualityAndRelationalExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();

        boolean isAGreaterThanB = a > b;
        if (isAGreaterThanB) {
            System.out.println(a + " is greater than " + b);
        }

        boolean isALessThanB = a < b;
        if (isALessThanB) {
            System.out.println(a + " is less than " + b);
        }

        boolean isAEqualToB = a ==b;
        System.out.println("isAEqualToB = " + isAEqualToB);

        boolean isANotEqualToB = a != b;
        System.out.println("isANotEqualToB = " + isANotEqualToB);

        boolean isAGreaterThanOrEqualToB = a >= b;
        System.out.println("isAGreaterThanOrEqualToB = " + isAGreaterThanOrEqualToB);

        boolean isALessThanOrEqualToB = a <= b;
        System.out.println("isALessThanOrEqualToB = " + isALessThanOrEqualToB);
    }
}
