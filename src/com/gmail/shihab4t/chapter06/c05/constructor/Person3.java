package com.gmail.shihab4t.chapter06.c05.constructor;

public class Person3 { // constructor changing
    private String name;
    private String email;
    private int age;

    public Person3(String name, String email, int age) {
        this(name, email);
        this.age = age;
    }

    public Person3(String name, String email) {
        this(name);
        this.email = email;
    }

    public Person3(String name) {
        this.name = name;
    }
}
