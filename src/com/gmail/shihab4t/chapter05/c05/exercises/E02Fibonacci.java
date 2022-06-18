package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Arrays;

public class E02Fibonacci {
    public static void main(String[] args) {
        int n = 20;

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println(Arrays.toString(fib));
    }
}
