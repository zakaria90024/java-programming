package com.gmail.shihab4t.chapter16.appendix;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class P17Pass {
    public static void changePersonName(Person person, String name) {
        person.setName(name);
    }

    public static void main(String[] args) {
        Person shihab = new Person("Shihab");
        changePersonName(shihab, "Mahamud");
        System.out.println("shihab = " + shihab);
    }
}
