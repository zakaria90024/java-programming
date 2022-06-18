package com.gmail.shihab4t.chapter04;

public class C23PiCalculator {
    public double calculate(int nTerms) {
        double numerator = 4.0;
        double denominator = 1.0;
        double sign = 1.0;

        double pi = 1.0;
        for (int i = 0; i < nTerms; i++) {
            pi += sign * (numerator / denominator);
            denominator += 2.0;
            sign *= -1.0;
        }
        return pi;
    }

    public static void main(String[] args) {
        C23PiCalculator piCalculator = new C23PiCalculator();
        var pi = piCalculator.calculate(100_000);
        System.out.println("pi = " + pi);
    }
}
