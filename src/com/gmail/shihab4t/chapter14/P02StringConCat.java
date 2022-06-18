package com.gmail.shihab4t.chapter14;

public class P02StringConCat {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "World";

        String res = str1.concat(str2);
        System.out.println(res);


        System.out.println("My name is ".concat(str2));

        System.out.println("Hello, " + "World!");

        System.out.println("a" + "b");
        System.out.println("a" + "b" + 3);
        System.out.println(1 + 2 + "c");

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);
    }
}
