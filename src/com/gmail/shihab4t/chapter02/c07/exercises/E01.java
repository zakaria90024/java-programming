package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        int sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sub);

        int mul = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mul);

        int divide = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + divide);
    }
}
