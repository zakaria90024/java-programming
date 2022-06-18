package com.gmail.shihab4t.chapter09.c02.generics.and.subtyping;

public class Subtyping {
    public static void main(String[] args) {
        DynamicArray<String> stringArray = new DynamicArray<>(12); // line #1
//        DynamicArray<Object> objectArray = stringArray; // line #2

//        objectArray.add(new Object()); // line #3
//        String item = stringArray.get(0); // line #4

        String string = new String();
        Object object = new Object();

        Object object2 = new Object();
//        String string2 = object2;
    }
}
