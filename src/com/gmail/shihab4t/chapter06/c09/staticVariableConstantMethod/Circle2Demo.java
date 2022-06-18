package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class Circle2Demo {
    public static void main(String[] args) {
        Circle2 circle1 = new Circle2(5);
        Circle2 circle2 = new Circle2(15);
        Circle2 circle3 = new Circle2(20);

        System.out.println("circle1 = " + circle1.getNumberOfObjectCreated());
        System.out.println("circle2 = " + circle2.getNumberOfObjectCreated());
        System.out.println("circle3 = " + circle3.getNumberOfObjectCreated());
    }
}
