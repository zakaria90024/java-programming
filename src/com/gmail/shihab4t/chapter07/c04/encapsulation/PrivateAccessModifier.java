package com.gmail.shihab4t.chapter07.c04.encapsulation;

class Bird {
    private String name;
    private int age;

    public Bird(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void sing() {
        System.out.printf("tweet tweet");
    }
}
