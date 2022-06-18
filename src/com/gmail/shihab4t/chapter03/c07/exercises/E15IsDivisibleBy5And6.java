package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E15IsDivisibleBy5And6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int x = input.nextInt();
        if (x % 5 == 0 && x % 6 == 0) {
            System.out.println(x + " is divisible by 5 and 6");
        }
        else {
            System.out.println(x + " is not divisible by 5 and 6");
        }
    }
}
