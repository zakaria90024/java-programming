package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E09ExchangeToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in BDT: ");
        double amount = input.nextDouble();

        System.out.print("Enter exchange rate (in USD): ");
        double usdRate = input.nextDouble();

        System.out.print("Enter exchange rate (in CAD): ");
        double cadRate = input.nextDouble();

        System.out.println("BDT: " + amount);
        System.out.println("USD: " + amount * usdRate);
        System.out.println("CAD: " + amount * cadRate);
    }
}
