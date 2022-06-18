package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P16CreatingSet {
    public static void main(String[] args) {
        Set<Integer> items = Set.of(1, 2, 3, 4, 5);

        Set<Integer> sourceSet = new HashSet<>();
        List<Integer> targetList =new ArrayList<>(sourceSet);
        System.out.println("sourceSet = " + sourceSet);
        System.out.println("targetList = " + targetList);

        List<Integer> sourceList = new ArrayList<>();
        Set<Integer> targetSet = new HashSet<>(sourceList);
        System.out.println("sourceList = " + sourceList);
        System.out.println("targetSet = " + targetSet);


    }
}
