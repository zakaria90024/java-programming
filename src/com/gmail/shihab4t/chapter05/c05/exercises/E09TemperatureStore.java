package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Scanner;

public class E09TemperatureStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] temps = new int[64][365];

        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;

        for (int i = 0; i < 365; i++) {
            System.out.println("Enter Temperature of " + (i+1) + "th day");
            for (int j = 0; j < 64; j++) {
                System.out.print("Enter for the Division " + (j+1) + " :");
                temps[j][i] = input.nextInt();
                minTemp = Math.min(minTemp, temps[j][i]);
                maxTemp = Math.max(maxTemp, temps[j][i]);
            }
        }

        int allAverage = 0, average;
        for (int i = 0; i < 64; i++) {
            average = 0;
            for (int j = 0; j < 365; j++) {
                average += temps[i][j];
            }
            average /= 365;
            allAverage += average;
            System.out.println("Average temperature of " + (i+1) + "th division: " + average);
        }
        System.out.println("Total Average temperature of the year is: " + allAverage / 64);
        System.out.println("Minimum Temperature: " + minTemp);
        System.out.println("Maximum Temperature: " + maxTemp);
    }
}
