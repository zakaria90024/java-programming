package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P20TreeMap {
    public static void main(String[] args) {
        Map<Person, String> phoneBook = new TreeMap<>();

        Person tahmid = new Person("Tahmid");
        Person rafi = new Person("Rafi");
        Person subeen = new Person("Subeen");
        Person salman = new Person("Salman");

        phoneBook.put(tahmid, "123456");
        phoneBook.put(rafi, "120259");
        phoneBook.put(subeen, "1202592");
        phoneBook.put(salman, "323496");

        for (Map.Entry<Person, String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}
