package com.gmail.shihab4t.chapter02;

import java.util.Scanner;

public class C04UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter Another Number: ");
        int b= input.nextInt();

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }
}
