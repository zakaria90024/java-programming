package com.gmail.shihab4t.chapter12;

import java.util.HashSet;
import java.util.Set;

public class P06HashSet {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

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
