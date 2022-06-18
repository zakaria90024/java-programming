package com.gmail.shihab4t.chapter07.c04.encapsulation;

class CoffeeMachine {
    public void swirl(boolean clockwise) {
        if (clockwise) {
            System.out.println("Swirling clockwise");
        } else {
            System.out.println("Swirling anticlockwise");
        }
    }
}