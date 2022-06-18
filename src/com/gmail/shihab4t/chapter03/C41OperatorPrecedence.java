package com.gmail.shihab4t.chapter03;

public class C41OperatorPrecedence {
    int status = 200;
    public static void main(String[] args) {
        int x = (12 - 4) * 2;

        int x2 = 3;
        int y = ++x2 * 5 / 2;
        System.out.println("y = " + y);

        int a = 10;
        int b = 5;
        int c = a * b / 2 % 2;
        System.out.println("c = " + c);

        int a2 = 10;
        int b2 = 5;
        int c2 = 3;
        int d = a2 * b2 / c2;
        System.out.println("d = " + d);
    }
}
