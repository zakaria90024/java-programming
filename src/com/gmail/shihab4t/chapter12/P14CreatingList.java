package com.gmail.shihab4t.chapter12;

import java.util.*;
import java.util.stream.IntStream;

public class P14CreatingList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("integers = " + integers);
        
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> numbers = Arrays.asList(array);
        System.out.println("numbers = " + numbers);
        
        int[] array2 = {1, 2, 3, 4, 5};
        List<int[]> numbers2 = Arrays.asList(array2);
        System.out.println("numbers2 = " + numbers2);

        int[] array3 = {1, 2, 3, 4, 5};
        List<Integer> numbers3 = new ArrayList<>();
        for (int number : array3) {
            numbers3.add(number);
        }
        System.out.println("numbers3 = " + numbers3);

        int[] array4 = {1, 2, 3, 4, 5, 4, 5};
        List<Integer> numbers4 = IntStream.of(array4).boxed().toList();
        System.out.println("numbers4 = " + numbers4);


    }
}
