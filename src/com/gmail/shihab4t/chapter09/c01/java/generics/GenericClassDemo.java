package com.gmail.shihab4t.chapter09.c01.java.generics;

public class GenericClassDemo {
    public static void main(String[] args) {
        Generic<Integer> iObj;
        iObj = new Generic<>(88);
        iObj.showType();

        Integer value = iObj.getObj();
        System.out.println("value = " + value);

        Generic<String> strObj = new Generic<>("This is a test");
        strObj.showType();

        String strValue = strObj.getObj();
        System.out.println("strValue = " + strValue);

//        Generic<int> intObj = new Generic<int>(50); // Error
    }
}
