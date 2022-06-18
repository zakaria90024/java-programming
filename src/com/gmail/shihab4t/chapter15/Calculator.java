package com.gmail.shihab4t.chapter15;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}