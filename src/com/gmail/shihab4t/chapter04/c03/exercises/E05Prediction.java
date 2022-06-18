package com.gmail.shihab4t.chapter04.c03.exercises;

public class E05Prediction {
    public static void main(String[] args) {
        int a = 100, x = 4, y = 11;
        if (x > y) {
            a = 21;
            x = x++;
        }
        System.out.println(a); // 100
    }
}
