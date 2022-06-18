package com.gmail.shihab4t.chapter07.c06.polymorphism;

abstract class PureAbstractClass {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
}

interface PureAbstractClass2 {
    void method1();
    void method2();
    void method3();
}


interface Actionable {
    void takeAction(String value);
}

class ActionableImpl implements Actionable {
    @Override
    public void takeAction(String value) {
        System.out.println("taking actions..with value: " + value);
    }
}


interface A {
    void method1();
    void method2();
}

interface B extends A {
    void method3();
    void method4();
}



interface Herbivore {
    void eatPlant();
}

interface Carnivore {
    void eatMeat();
}

interface Mammal {
    void move();

    boolean possessIntelligence();
}

class Human implements Mammal, Carnivore, Herbivore {
    @Override
    public void eatMeat() {

    }

    @Override
    public void eatPlant() {

    }

    @Override
    public void move() {

    }

    @Override
    public boolean possessIntelligence() {
        return false;
    }
}
