package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class Circle {
    private int radius;
    private static final double  PI = 3.1416;
    private static final double GRAVITATIONAL_CONSTANT = 6.674 * Math.pow(10, -11);

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }


}
