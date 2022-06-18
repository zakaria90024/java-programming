package com.gmail.shihab4t.chapter09.c05.generic.method;

public class GenericSTackDemo {
    public static void main(String[] args) {
        GenericStack<String> cities = new GenericStack<>();
        cities.push("Dhaka");
        cities.push("Toronto");
        cities.push("Ottawa");
        cities.push("Calgary");

        cities.pop();
        cities.printElements();
    }
}
