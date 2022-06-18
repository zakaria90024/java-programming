package com.gmail.shihab4t.chapter08;

public class C11PrintExceptionInfo {
    public static void main(String[] args) {
        int a = 5;
        try {
            int result = a / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
