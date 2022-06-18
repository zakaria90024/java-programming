package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class E04Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }
        int mid_indx, j, tmp;
        for (int i = 0; i < n; i++) {
            mid_indx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[mid_indx]) {
                    mid_indx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[mid_indx];
            arr[mid_indx] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
