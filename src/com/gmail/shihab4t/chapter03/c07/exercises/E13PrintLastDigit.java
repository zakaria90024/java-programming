package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E13PrintLastDigit {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Last Digit: " + x % 10);
    }
}
