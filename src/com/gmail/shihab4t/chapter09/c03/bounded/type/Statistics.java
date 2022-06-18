package com.gmail.shihab4t.chapter09.c03.bounded.type;

public class Statistics <T extends Number> {
    private T[] numbers;

    public Statistics(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

}
