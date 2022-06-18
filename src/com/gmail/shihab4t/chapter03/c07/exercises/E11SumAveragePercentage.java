package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E11SumAveragePercentage {
    public static void main(String[] args) {
        int a, b, c, d, e, f;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();

        int sum = (a + b + c + d + e + f);
        System.out.println("All: " + sum);
        double average = sum * 1.0 / 6;
        System.out.println("Average: " + average);
        double percentage = sum * 1.0 / 100;
        System.out.println("Percentage = " + percentage);
    }
}
