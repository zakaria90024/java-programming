package com.gmail.shihab4t.chapter12;

import java.util.LinkedHashSet;
import java.util.Set;

public class P07LinkedHashSet {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Dhaka");
        cities.add("Jessore");
        cities.add("Mymensingh");
        cities.add("Mymensingh");
        cities.add("Cox's Bazar");
        cities.add("Cox's Bazar");

        System.out.println("Total cities: " + cities.size());
        System.out.println(cities);
    }
}
