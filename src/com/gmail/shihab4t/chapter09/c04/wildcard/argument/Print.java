package com.gmail.shihab4t.chapter09.c04.wildcard.argument;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Object> object = new ArrayList<Object>();
        object.add(55);
        printList(object);

        List<String> strList = new ArrayList<String>();
        strList.add("one");
        printList(strList);
    }
}
