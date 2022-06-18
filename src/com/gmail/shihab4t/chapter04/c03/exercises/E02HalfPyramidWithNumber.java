package com.gmail.shihab4t.chapter04.c03.exercises;

public class E02HalfPyramidWithNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
