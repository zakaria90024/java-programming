package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Scanner;

public class E05FindMaxMinFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }

        int mx = arr[0];
        int mn = arr[0];

        for (int i = 1; i < n; i++) {
            if (mx < arr[i]) {
                mx = arr[i];
            }
            if (mn > arr[i]) {
                mn = arr[i];
            }
        }

        System.out.println("Max = " + mx + "\nMin = " + mn);
    }
}
