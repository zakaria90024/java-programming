package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E01AllEqual {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.print("Enter four number: ");
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("All are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
