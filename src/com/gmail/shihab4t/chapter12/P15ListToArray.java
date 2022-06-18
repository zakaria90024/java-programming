package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P15ListToArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] myArray = numbers.toArray(new Integer[0]);

        System.out.println("myArray = " + Arrays.toString(myArray));
    }
}
