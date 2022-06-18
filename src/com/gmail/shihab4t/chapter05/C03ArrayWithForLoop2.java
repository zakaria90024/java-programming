package com.gmail.shihab4t.chapter05;

import java.util.Scanner;

public class C03ArrayWithForLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "\t" + numbers[i]);
        }
    }
}
