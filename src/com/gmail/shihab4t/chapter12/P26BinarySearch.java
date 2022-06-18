package com.gmail.shihab4t.chapter12;

import java.util.Arrays;

public class P26BinarySearch {
    public static void main(String[] args) {
        int[] array = {30, 20, 5, 12, 55};

        Arrays.sort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
        int searchValue = 12;
        
        int index = Arrays.binarySearch(array, searchValue);
        System.out.println("index = " + index);
    }
}
