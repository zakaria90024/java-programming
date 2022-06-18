package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E02Average {
    public static void main(String[] args) {
        System.out.print("Enter Five numbers: ");
        int a, b, c, d, e;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();

        int average = a + b + c + d + e;
        average /= 5;

        System.out.println("average = " + average);
    }
}
