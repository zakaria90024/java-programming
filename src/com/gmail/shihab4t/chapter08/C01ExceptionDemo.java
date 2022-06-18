package com.gmail.shihab4t.chapter08;

public class C01ExceptionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        int result = divide(a, b); // 1
        System.out.println("result = " + result); // 2
    }

    private static int divide(int a , int b) {
        return a / b;
    }
}
