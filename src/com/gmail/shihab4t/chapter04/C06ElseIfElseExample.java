package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C06ElseIfElseExample {
    public static void main(String[] args) {
        int number = 15;

        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number: ");

        int guess = input.nextInt();

        if (guess == number) {
            System.out.println("Congratulations! " + "You guessed the number correctly.");
        } else if (number > guess) {
            System.out.println("The number is greater than " + guess);
        } else {
            System.out.println("The number is less than " + guess);
        }
    }
}
