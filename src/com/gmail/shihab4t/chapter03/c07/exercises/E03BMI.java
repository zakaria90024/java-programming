package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E03BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double w = input.nextDouble();
        System.out.print("Enter your height: ");
        double h = input.nextDouble();

        double dmi = w / (h * h);

        System.out.println("Your Body Mass Index (DMI) is " + dmi);
    }
}
