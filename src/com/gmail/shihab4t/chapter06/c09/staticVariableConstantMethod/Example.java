package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class Example {
    static int anotherNumber = 10;
    int number = 5;

    public int multiplyWith(int value) {
        return value * anotherNumber * number;
    }

//    public static int subtractWith(int value) {
//        return value - number;
//    }
}
