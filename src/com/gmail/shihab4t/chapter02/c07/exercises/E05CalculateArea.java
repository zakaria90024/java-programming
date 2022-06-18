package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;

public class E05CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = input.nextInt();
        System.out.print("Enter Deft: ");
        int deft = input.nextInt();

        int area = length * deft;
        System.out.println("The are of: " + area);

        int porisima = 2 * (length + deft);

        System.out.println("The Porisima of: " + porisima);
    }
}
