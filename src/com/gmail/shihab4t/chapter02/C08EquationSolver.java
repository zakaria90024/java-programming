package com.gmail.shihab4t.chapter02;

import java.util.Scanner;

public class C08EquationSolver {
    public static void main(String[] args) {
        System.out.println("y = ax^2 + bx + c\nDo you want to y value");

        System.out.print("Enter x = ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();

        System.out.print("Enter a = ");
        int a = input.nextInt();

        System.out.print("Enter b = ");
        int b = input.nextInt();

        System.out.print("Enter c = ");
        int c = input.nextInt();

        // y = ax^2 + bx + c
        double y = a * x * x + b * x + c;
        System.out.println("y = " + y);
    }
}
