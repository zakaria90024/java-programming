package com.gmail.shihab4t.chapter07.c04.encapsulation;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Shihab");
        System.out.println(person.getName());
        person.name = "Nafis";
        System.out.printf(person.getName());
    }
}