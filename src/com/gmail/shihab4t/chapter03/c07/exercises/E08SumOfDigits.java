package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E08SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number between (0 to 1000): ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum = 0;

        System.out.print("The sum of all digits of " + num);
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(" is: " + sum);
    }
}
