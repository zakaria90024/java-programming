package com.gmail.shihab4t.chapter07.c05.inheritance;

class Shape {
}

class Circle extends Shape {
}

class Triangle extends Shape {
}

class ShapeFactory {
    public Shape newShape(String type) {
        return new Shape();
    }
}

class CircleFactory extends ShapeFactory {
    @Override
    public Circle newShape(String type) {
        return new Circle();
    }
}