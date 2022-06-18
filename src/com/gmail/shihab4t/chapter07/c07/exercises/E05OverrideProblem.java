package com.gmail.shihab4t.chapter07.c07.exercises;

class Shape {
    public void draw() {
        System.out.println("drawing shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing Circle");
    }
}