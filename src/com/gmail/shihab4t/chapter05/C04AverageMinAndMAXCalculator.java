package com.gmail.shihab4t.chapter05;

import java.util.Scanner;

public class C04AverageMinAndMAXCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
