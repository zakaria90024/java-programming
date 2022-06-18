package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);

        System.out.println("area of circle1 = " + circle1.getArea());
        System.out.println("area of circle2 = " + circle2.getArea());
    }
}
