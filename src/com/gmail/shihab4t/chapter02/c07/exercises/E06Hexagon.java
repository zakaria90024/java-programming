package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;
import java.lang.Math;

public class E06Hexagon {
    public static void main(String[] args) {
        System.out.println("Enter a of hexagon: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        double threeRootThree = 3 * Math.sqrt(3);

        double areaOfAHexagon = threeRootThree / 2 * a * a;

        System.out.println("Area of a Hexagon: " + areaOfAHexagon);
    }
}
