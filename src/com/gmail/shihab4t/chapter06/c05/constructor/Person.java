package com.gmail.shihab4t.chapter06.c05.constructor;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("age: " + age);
    }
}
