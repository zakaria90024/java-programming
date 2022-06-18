package com.gmail.shihab4t.chapter07.c07.exercises;

class AreaCalculator {
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double getArea(int length, int width) {
        return length * width / 2.0;
    }
//    public double getArea(int base, int height) {
//        return 2.0;
//    }
    public double getArea(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    
}
