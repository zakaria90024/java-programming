package com.gmail.shihab4t.chapter03;

public class C37WideningPrimitiveConversion {
    public static void main(String[] args) {
        int anInt = 100;
        long aLong = anInt; // no explicit casting
        float aFloat = aLong; // no explicit casting

        System.out.println("Int Value " + anInt);
        System.out.println("Long Value " + aLong);
        System.out.println("Float Value " + aFloat);
    }
}
