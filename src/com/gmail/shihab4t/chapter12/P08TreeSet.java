package com.gmail.shihab4t.chapter12;

import java.util.Set;
import java.util.TreeSet;

public class P08TreeSet {
    public static void main(String[] args) {
        Set<Integer> cities = new TreeSet<>();

        cities.add(4);
        cities.add(1);
        cities.add(5);
        cities.add(2);
        cities.add(3);
        cities.add(3);

        System.out.println("Total cities: " + cities.size());
        System.out.println(cities);
    }
}
