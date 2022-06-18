package com.gmail.shihab4t.chapter12;

import java.util.Set;
import java.util.TreeSet;

public class P09PersonComparable implements Comparable<P09PersonComparable> {
    private String name;

    public P09PersonComparable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P09PersonComparable{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(P09PersonComparable o) {
        return this.name.compareTo(o.name);
    }
}

class PersonDemon {
    public static void main(String[] args) {
        Set<P09PersonComparable> persons = new TreeSet<>();
        persons.add(new P09PersonComparable("Rokon"));
        persons.add(new P09PersonComparable("Swarna"));
        persons.add(new P09PersonComparable("Rifat"));
        persons.add(new P09PersonComparable("Eram"));
        persons.add(new P09PersonComparable("Tabassum"));

        for (var person : persons) {
            System.out.println(person);
        }
    }
}