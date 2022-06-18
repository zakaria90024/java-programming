package com.gmail.shihab4t.chapter08;

import java.util.Scanner;

public class C04InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number;

        do {
            number = input.nextInt();
            if (number != -1) {
                System.out.println("You entered: " + number + ", enter another number (-1 exit): ");
            } else {
                System.out.println("Program exited.");
            }
        } while (number != -1);
    }
}
