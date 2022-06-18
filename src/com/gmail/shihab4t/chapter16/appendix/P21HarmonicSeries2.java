package com.gmail.shihab4t.chapter16.appendix;

public class P21HarmonicSeries2 {
    public static void main(String[] args) {
        double  value = harmonic(4);
    }

    public static double harmonic(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double divide = divide(1.0, i);
            sum += add(sum, divide);
        }
        return sum;
    }

    public static double divide(double a, double b) {
        return a * b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
