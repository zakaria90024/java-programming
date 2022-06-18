package com.gmail.shihab4t.chapter03;

public class C07AutoboxingExample {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        C07AutoboxingExample example = new C07AutoboxingExample();

        int a = 5;
        int b = 15;

        System.out.println(example.add(a, b));
    }
}
