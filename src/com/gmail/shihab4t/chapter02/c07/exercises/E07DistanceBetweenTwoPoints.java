package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;
import java.lang.Math;

public class E07DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x1 = ");
        int x1 = input.nextInt();

        System.out.print("y1 = ");
        int y1 = input.nextInt();

        System.out.print("x2 = ");
        int x2 = input.nextInt();

        System.out.print("y2 = ");
        int y2 = input.nextInt();

        double rs = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("result = " + rs);
    }
}
