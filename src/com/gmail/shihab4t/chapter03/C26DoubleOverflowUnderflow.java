package com.gmail.shihab4t.chapter03;

public class C26DoubleOverflowUnderflow {
    public static void main(String[] args) {
        double a = Double.MAX_VALUE * 2;
        System.out.println(a); // overflow
        double b = Double.MIN_VALUE / 2;
        System.out.println(b);
    }
}
