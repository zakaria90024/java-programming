package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E18IsPossibleSplitThePizzaFairly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total slices: ");
        int totalSlices = input.nextInt();
        System.out.print("Enter number of your friend(s): ");
        int numberOfFriends = input.nextInt();
        System.out.print("How many slices each wants: ");
        int eachWant = input.nextInt();

        if (totalSlices >= numberOfFriends * eachWant) {
            System.out.println("Yes, it's possible to split the pizza fairly.");
        } else {
            System.out.println("Sorry, it's not possible to split the pizza fairly.");
        }
    }
}
