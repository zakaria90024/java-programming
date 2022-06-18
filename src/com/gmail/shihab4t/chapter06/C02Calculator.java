package com.gmail.shihab4t.chapter06;

class Calculator {
    public int performAddition(int a, int b) {
        return a + b;
    }
    public int performSubtraction(int a, int b) {
        return a - b;
    }
}


class Main2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.performAddition(4, 5));
        System.out.println(calculator.performSubtraction(5, 1));

    }
}