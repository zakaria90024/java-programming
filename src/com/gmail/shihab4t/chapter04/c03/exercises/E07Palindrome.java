package com.gmail.shihab4t.chapter04.c03.exercises;

import java.util.Scanner;

public class E07Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int tmp = number;
        int newNumber = 0;
        while (number > 0) {
            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;
        }

        if (newNumber == tmp) {
            System.out.println(tmp + " is Palindrome number");
        } else {
            System.out.println(tmp + " is not Palindrome number");
        }
    }
}
