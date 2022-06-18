package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E16CalculateTimeNeedForBuyingCar {
    public static void main(String[] args) {
        long carPrice = 3_500_000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount that you want to store");
        long amount = input.nextInt();

        long month = (carPrice / amount);
        System.out.println("month = " + month);
        long days = month * 30;
        System.out.println("days = " + days);
    }
}
