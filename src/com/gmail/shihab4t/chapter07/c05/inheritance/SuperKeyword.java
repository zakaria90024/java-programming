package com.gmail.shihab4t.chapter07.c05.inheritance;

class Vehicle {
    int noOfWheels = 4;
}

class Bus extends Vehicle {
    int noOfWheels = 6;

    public void printWheels() {
        System.out.println("Number of wheels in Bus: " + noOfWheels);
        System.out.println("Number of wheels in Vehicle: " + super.noOfWheels);
    }
}