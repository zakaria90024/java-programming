package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class E06RemoveOddFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }

        int[] newArr = new int[n];
        int nn = 0;

        for (int ith : arr) {
            if (ith % 2 == 0) {
                newArr[nn++] = ith;
            }
        }

        if (n > nn) {
            newArr = Arrays.copyOfRange(newArr, 0, nn);
        }

        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr.length);
    }
}
