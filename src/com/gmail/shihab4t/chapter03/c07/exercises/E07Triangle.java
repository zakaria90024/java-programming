package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E07Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first edge: ");
        int x = input.nextInt();

        System.out.print("Enter second edge: ");
        int y = input.nextInt();

        System.out.print("Enter third edge: ");
        int z = input.nextInt();

        int tmp;
        if (x < y) {
            tmp = x;
            x = y;
            y = tmp;
        }
        if (x < z) {
            tmp = x;
            x = z;
            z = tmp;
        }

//        System.out.println(x + " " + y + " " + z);

        if (x < y + z) {
            System.out.println("Inputs are valid");
        }
        else {
            System.out.println("Inputs are invalid");
        }
    }
}
