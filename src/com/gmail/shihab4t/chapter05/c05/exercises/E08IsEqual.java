package com.gmail.shihab4t.chapter05.c05.exercises;

public class E08IsEqual {
    public boolean isEqual(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        E08IsEqual isEqual = new E08IsEqual();

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        if (isEqual.isEqual(arr, arr2)) {
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
    }
}
