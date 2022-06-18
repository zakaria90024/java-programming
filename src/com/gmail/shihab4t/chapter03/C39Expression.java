package com.gmail.shihab4t.chapter03;

public class C39Expression {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        System.out.println("The largest value that an integer " + "can hold is: " + x);

        int y = 5;
        double z = y * y + 2 + Math.random();

        int expression = (int) ((x + y) / 2 - z); // more readable

    }
}
