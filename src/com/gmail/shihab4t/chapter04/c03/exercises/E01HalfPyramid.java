package com.gmail.shihab4t.chapter04.c03.exercises;

public class E01HalfPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            char ch = (char)('A' + i - 1);
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
