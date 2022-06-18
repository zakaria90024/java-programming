package com.gmail.shihab4t.chapter05;

import java.util.Arrays;

public class C10ArrayCopy {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        int[] copyTo = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            copyTo[i] = myArray[i];
        }


        // System.arraycopy() methods
        // public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(myArray,5, copyTo, 7, 10);


        int[] array = {23, 43, 55, 12};
        int[] copiedArray = Arrays.copyOf(array, 10);


        int[] array2 = {23, 43, 55, 12, 65, 88, 92};
        int[] copiedArray2 = Arrays.copyOfRange(array, 1, 4);
    }
}
