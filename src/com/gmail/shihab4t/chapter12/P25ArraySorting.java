package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P25ArraySorting {
    public static void main(String[] args) {
       Person[] persons = new Person[] {
               new Person("Person # 2"),
               new Person("Person # 1"),
               new Person("Person # 4"),
               new Person("Person # 3"),
       };

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(Arrays.toString(persons));
    }
}
