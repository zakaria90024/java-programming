package com.gmail.shihab4t.chapter12;

import java.util.LinkedList;
import java.util.List;

public class P03LinkedList {
    public static void main(String[] args) {
        List<String> topCities = new LinkedList<>();

        topCities.add("London");
        topCities.add("New York");
        topCities.add("Paris");

        System.out.println("topCities = " + topCities);
    }
}
