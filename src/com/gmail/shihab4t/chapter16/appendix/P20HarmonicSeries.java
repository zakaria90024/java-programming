package com.gmail.shihab4t.chapter16.appendix;

public class P20HarmonicSeries {
    public static void main(String[] args) {
        double  value = harmonic(4);
        System.out.println(value);
    }

    public static double harmonic(int n) {
        double sum = 0.0;
        System.out.println("initial sum = " + sum);

        for (int i = 1; i <= n; i++) {
            double divide = divide(1.0, i);
            System.out.println("1.0/" + i + " = " + divide);
            sum += add(sum, divide);

            System.out.println("sum = " + sum);
        }
        return sum;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
