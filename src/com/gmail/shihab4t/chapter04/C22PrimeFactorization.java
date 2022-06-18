package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C22PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int num = input.nextInt();

        System.out.println("Prime Factor of " + num + " is: ");

        int root = (int) Math.sqrt(num);
        for (int i = 2; i <= root; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
            root = (int) Math.sqrt(num);
        }
        if (num > 1) {
            System.out.print(num);
        }
        System.out.println();
    }
}
