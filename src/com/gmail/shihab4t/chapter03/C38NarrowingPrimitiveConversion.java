package com.gmail.shihab4t.chapter03;

public class C38NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        double aDouble = 97.04;
        long aLong = (long) aDouble; // explicit type casting
        int aInt = (int) aLong; // explicit type casting

        System.out.println("Double value " + aDouble);
        System.out.println("Long value " + aLong);
        System.out.println("Int value " + aInt);

        // data loss
        System.out.println("\nData loss:");
        long y = 1_233_720_377_5807L;
        System.out.println("Long Value: " + y);

        int x = (int) y;
        System.out.println("After Narrowing Primitive Conversion: " + x);
    }
}
