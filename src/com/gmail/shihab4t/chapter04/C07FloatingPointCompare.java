package com.gmail.shihab4t.chapter04;

public class C07FloatingPointCompare {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.1 + 0.1 + 0.1;

        if (a == b) {
            System.out.println("both of them are equal");
        } else {
            System.out.println("they are not equal");
        }

        System.out.println(a + "\n" + b);

    }
}
