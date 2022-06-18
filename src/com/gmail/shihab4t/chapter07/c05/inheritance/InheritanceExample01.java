package com.gmail.shihab4t.chapter07.c05.inheritance;

class Animal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("meow meow!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof Woof");
    }
}

class Cow extends Animal {
    public void moo() {
        System.out.println("Moo moo!");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        System.out.println();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
    }
}



