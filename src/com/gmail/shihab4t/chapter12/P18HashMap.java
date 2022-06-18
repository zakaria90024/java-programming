package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P18HashMap {
    public static void main(String[] args) {
        Map<String, Integer> citiesWithPopulation = new HashMap<>();

        citiesWithPopulation.put("Tokyo", 37_400_068);
        citiesWithPopulation.put("Delhi", 28_514_000);
        citiesWithPopulation.put("Dhaka", 19_578_000);
        citiesWithPopulation.put("New York", 8_601_186);
        citiesWithPopulation.put("Istanbul", 15_519_267);

        System.out.println("citiesWithPopulation = " + citiesWithPopulation);

        var population = citiesWithPopulation.get("Dhaka");
        System.out.println("population of dhaka = " + population);

        var keys = citiesWithPopulation.keySet();
        System.out.println("keys = " + keys);

        var values = citiesWithPopulation.values();
        System.out.println("values = " + values);

        var dhakaExist = citiesWithPopulation.containsKey("Dhaka");
        System.out.println("dhakaExist = " + dhakaExist);

        var containsValue = citiesWithPopulation.containsValue(1203030);
        System.out.println("containsValue = " + containsValue);

        var total = citiesWithPopulation.size();
        System.out.println("total = " + total);


    }
}
