package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Scanner;

public class E07FindTwoElementThatTheSumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of element: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the n: ");
        int n = input.nextInt();

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println("First: " + arr[i] + ", Second: " + arr[j]);
                    return;
                }
            }
        }
    }
}
