package com.gmail.shihab4t.chapter07.c07.exercises;

class Animal {

}

class  Horse extends Animal {

}

class UseAnimal {
    public void doSomething(Animal animal) {
        System.out.println("Inside animal version");
    }

    public void doSomething(Horse animal) {
        System.out.println("Inside horse version");
    }

    public static void main(String[] args) {
        Animal animal = new Horse();
        UseAnimal useAnimal = new UseAnimal();
        useAnimal.doSomething(animal); // animal
    }
}
