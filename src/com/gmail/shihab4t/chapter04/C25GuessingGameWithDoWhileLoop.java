package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C25GuessingGameWithDoWhileLoop {
    public static void main(String[] args) {
        int number = 15;

        Scanner input = new Scanner(System.in);

        int guess;
        do {
            System.out.print("Guess a number: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You Guessed the number.");
            } else if (number > guess) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        } while (guess != number);
    }
}
