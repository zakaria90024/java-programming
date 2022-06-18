package com.gmail.shihab4t.chapter04.c03.exercises;

import java.util.Scanner;

public class E06GroceryStore {
    public static void main(String[] args) {
        System.out.print("How many product did you buy?: ");
        Scanner input = new Scanner(System.in);
        int amountOfProduct = input.nextInt();

        System.out.println("Enter their price one by one: ");
        int price, totalPrice = 0;
        for (int i = 0; i < amountOfProduct; i++) {
            price = input.nextInt();
            totalPrice += price;
        }

        totalPrice = totalPrice + (totalPrice * 15 / 100);
        System.out.println("Total price: " + totalPrice);

        int tmp, enteredTotal = 0;
        boolean condition = true;
        do {
            System.out.print("Please pay the money: ");
            int payed = input.nextInt();
            enteredTotal += payed;
            tmp = enteredTotal - totalPrice;
            if (enteredTotal >= totalPrice) {
                System.out.println("Here is your changes: " + tmp);
                condition = false;
            } else {
                System.out.println("You have to pay more " + -tmp);
            }
        } while (condition);
    }
}
