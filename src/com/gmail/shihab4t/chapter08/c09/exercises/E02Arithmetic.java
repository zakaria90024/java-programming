package com.gmail.shihab4t.chapter08.c09.exercises;

import java.util.Scanner;

public class E02Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Enter a number: ");
                a = input.nextInt();
                System.out.println("Enter another number: ");
                b = input.nextInt();
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("You must be Enter a number");
            }
        }

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        try {
            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
