package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C01VoterEligibilityCheckerWithIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you?: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations! " + "You're eligible to vote.");
        }

        if (age >= 18) System.out.println("Congratulations! " + "You're eligible to vote.");

        if (age >= 18)
            System.out.println("Congratulations! " + "You're eligible to vote.");

    }
}
