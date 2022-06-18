package com.gmail.shihab4t.chapter07.c05.inheritance;

class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBreak(int decrement) {
        speed += decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;

    public void setSeatHeight(int seatHeight) {
        this.seatHeight =  seatHeight;
    }
}

class BikeDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.setGear(5);
    }
}


