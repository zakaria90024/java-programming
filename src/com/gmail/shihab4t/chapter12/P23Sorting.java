package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P23Sorting {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(3);
        listA.add(2);
        Collections.sort(listA);
        System.out.println("listA = " + listA);
        
        List<Integer> listB = new LinkedList<>();
        listB.add(15);
        listB.add(13);
        listB.add(20);
        Collections.sort(listB);
        System.out.println("listB = " + listB);
    }
}
