package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class Circle2 {
    private static final double PI = 3.1416;
    private static int numberOfObjectCreated = 0;
    private int radius;

    public Circle2(int radius) {
        this.radius = radius;
        numberOfObjectCreated++;
    }

    public int getNumberOfObjectCreated() {
        return numberOfObjectCreated;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
