package com.gmail.shihab4t.chapter12;

import java.util.List;
import java.util.Vector;

public class P02Vector {
    public static void main(String[] args) {
        List<String> topCities = new Vector<>();

        topCities.add("London");
        topCities.add("New York");
        topCities.add("Paris");
        topCities.add("Moscow");
        topCities.add("Dubai");
        topCities.add("Barcelona");

        // print the all
        System.out.println("Top cities: ");
        System.out.println(topCities);

        var totalCities = topCities.size();
        System.out.println("totalCities = " + totalCities);

        var secondCity = topCities.get(1);
        System.out.println("secondCity = " + secondCity);

        System.out.println(topCities);
        topCities.set(1, "Toronto");
        System.out.println(topCities);

        topCities.remove(2);
        System.out.println(topCities);

        topCities.add("Toronto");
        topCities.add("Toronto");
        System.out.println(topCities);

        boolean isTorontoAdded = topCities.contains("Toronto");
        System.out.println("isTokyoAdded = " + isTorontoAdded);

        int firstIndexToronto = topCities.indexOf("Toronto");
        System.out.println("firstIndexToronto = " + firstIndexToronto);

        int lastIndexOfToronto = topCities.lastIndexOf("Toronto");
        System.out.println("lastIndexOfToronto = " + lastIndexOfToronto);

    }
}
