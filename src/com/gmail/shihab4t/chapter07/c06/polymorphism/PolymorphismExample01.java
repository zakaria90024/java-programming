package com.gmail.shihab4t.chapter07.c06.polymorphism;

import java.util.ArrayList;

class Liquid {
    public void swirl(boolean clockwise) {
        System.out.println("swirling liquid.");
    }
}

class Coffee extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling coffee");
    }
}

class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling milk");
    }
}

class Cup {
    public ArrayList<Liquid> liquids = new ArrayList<>();

    public void addLiquid(Liquid liquid) {
        liquids.add(liquid);
    }

    public void mix() {
        for (Liquid liquid : liquids) {
            liquid.swirl(true);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Liquid myFavoriteBeverage = new Liquid();

        Liquid genericLiquid = new Liquid();
        Liquid milk = new Milk();
        Liquid coffee = new Coffee();

        Cup cup = new Cup();
        cup.addLiquid(genericLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}

