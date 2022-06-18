package com.gmail.shihab4t.chapter07.c06.polymorphism;

class Liquid2 {
    public void swirl(boolean clockwise) {
        System.out.println("swirling liquid.");
    }
}

class Coffee2 extends Liquid2 {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling coffee");
    }
}

class Upcasting {
    public static void main(String[] args) {
        Liquid2 liquid = new Coffee2(); // implicit casting or upcasting
//        Liquid2 liquid2 = new String(); // incompatible types
    }
}



class Dog {
    public String getBread() {
        return "Unknown";
    }
}

class Poodle extends Dog {
    @Override
    public String getBread() {
        return "Poodle";
    }
    public String getName() {
        return "Daisy";
    }
}

class Bulldog extends Dog {
    @Override
    public String getBread() {
        return "Bulldog";
    }
}

class DogWalker {
    public void walk(Dog dog) {
        if (dog instanceof Poodle) {
            Poodle poodle = (Poodle) dog;
            System.out.println("Waling " + poodle.getName());
        } else {
            System.out.println("Walking " + dog.getBread());
        }
    }
}

class DogWalker2 {
    public void walk(Dog dog) {
        if (dog instanceof Poodle poodle) {
            System.out.println("Walking " + poodle.getName());
        } else {
            System.out.println("Walking " + dog.getBread());
        }
    }
}

class Downcastring {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Poodle();
        Dog dog3 = new Bulldog();

        DogWalker dogWalker = new DogWalker();
        dogWalker.walk(dog1);
        dogWalker.walk(dog2);
        dogWalker.walk(dog3);
    }
}