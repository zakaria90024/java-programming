package com.gmail.shihab4t.chapter04.c03.exercises;

import java.util.Scanner;

public class E04PrintMaxMinFromNumbers {
    public static void main(String[] args) {
        System.out.print("Enter amount of numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x, mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        while (n-- > 0) {
            x = input.nextInt();
            mx = Math.max(mx, x);
            mn = Math.min(mn, x);
        }

        System.out.println("Max: " + mx);
        System.out.println("Min: " + mn);
    }
}
