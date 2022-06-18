package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;
import java.lang.Math;

public class E10RadiansToDegrees {
    public static void main(String[] args) {
        System.out.print("Enter radians: ");
        Scanner input = new Scanner(System.in);

        double pi = Math.PI;

        double radians = input.nextDouble();
        double degrees = (radians * (180 / pi));
        System.out.println("degrees = " + degrees);
    }
}
