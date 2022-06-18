package com.gmail.shihab4t.chapter12;

import java.util.*;

class Person2 implements Comparable<Person2> {
    private String firstName, lastName;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person2 o) {
        int len1 = this.firstName.length();
        int len2 = o.firstName.length();
        int lim = Math.min(len1, len2);
        char v1[] = this.firstName.toCharArray();
        char v2[] = o.firstName.toCharArray();
        int k = 0;

        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
}


class LastNameComparator implements Comparator<Person2> {
    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}


public class P24PersonSort {
    public static void main(String[] args) {
        List<Person2> persons = new ArrayList<>();
        persons.add(new Person2("James", "Gosling"));
        persons.add(new Person2("Gavin", "King"));
        persons.add(new Person2("Rod", "Johnson"));
        persons.add(new Person2("Craing", "Mcclanahan"));

        Collections.sort(persons);
        for (Person2 person: persons) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
        System.out.println();

        Collections.sort(persons, new LastNameComparator());
        for (Person2 person: persons) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
        System.out.println();

    }
}
