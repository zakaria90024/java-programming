package com.gmail.shihab4t.chapter03;

public class C08UnboxingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        C08UnboxingExample example = new C08UnboxingExample();

        Integer a = 5;
        Integer b = 15;

        System.out.println(example.add(a, b));
    }
}
