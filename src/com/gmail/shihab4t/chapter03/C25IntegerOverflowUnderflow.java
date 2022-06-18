package com.gmail.shihab4t.chapter03;

public class C25IntegerOverflowUnderflow {
    public static void main(String[] args) {
        int a = 2_147_483_647;
        a = a + 1;
        System.out.println(a);

        int b = -2_147_483_648;
        b = b - 1;
        System.out.println(b);
    }
}
