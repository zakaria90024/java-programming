package com.gmail.shihab4t.chapter07.c06.polymorphism;

abstract class Animal {
    private final int legs;
    private String name;

    public Animal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public abstract String getDiets();

    @Override
    public String toString() {
        return (name + " has " + legs + " leg(s)");
    }
}

class Lion extends Animal {
    public Lion() {
        super(4, "Lion");
    }

    @Override
    public String getDiets() {
        return "Meat";
    }
}

class Tiger extends Animal {
    public Tiger() {
        super(4, "Tiger");
    }

    @Override
    public String getDiets() {
        return "Somethings";
    }
}

class Snack extends Animal {
    public Snack() {
        super(0, "Snack");
    }

    @Override
    public String getDiets() {
        return "Somethings";
    }
}

class Deer extends Animal {
    public Deer() {
        super(4, "Deer");
    }

    public String getDiets() {
        return "Grass";
    }
}

class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printInfo() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println("Diet: " + animal.getDiets());
        }
    }
}

class ZooDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Lion();
        animals[2] = new Snack();

        Zoo zoo = new Zoo(animals);

        zoo.printInfo();
    }
}