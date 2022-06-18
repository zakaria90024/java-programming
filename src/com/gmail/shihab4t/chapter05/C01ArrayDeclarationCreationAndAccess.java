package com.gmail.shihab4t.chapter05;

public class C01ArrayDeclarationCreationAndAccess {
    public static void main(String[] args) {
        int[] anArray;
        int anArray2[];

        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDouble;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;

        System.out.println("Item 1 at index 0: " + anArray[0]);
        System.out.println("Item 2 at index 1: " + anArray[1]);
        System.out.println("Item 3 at index 2: " + anArray[2]);

        int[] num = {100, 200, 300, 400, 500, 600};
        double[] num2 = {1.9, 3.4, 5.6, 9.4};

        int length = anArray.length;

        System.out.println("Total items in the array is: " + length);
    }
}
