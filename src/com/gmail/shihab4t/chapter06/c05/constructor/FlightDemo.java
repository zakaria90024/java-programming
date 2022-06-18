package com.gmail.shihab4t.chapter06.c05.constructor;

public class FlightDemo {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        flight.addOnePassenger(2, 2);
        int totalCheckedBags = flight.getTotalCheckedBags();
        System.out.println("Total Checked Bags = " + totalCheckedBags);
        int totalPassengers = flight.getTotalPassengers();
        System.out.println("Total Passengers = " + totalPassengers);
    }
}
