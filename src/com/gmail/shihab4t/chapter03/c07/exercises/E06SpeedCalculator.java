package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E06SpeedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double distance = input.nextDouble();

        System.out.print("Enter time taken in minutes: ");
        double time = input.nextDouble();

        distance /= 1000;
        time /= 60;

        System.out.println("Speed in km/h is " + distance / time);
    }
}
