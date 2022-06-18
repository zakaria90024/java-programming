package com.gmail.shihab4t.chapter02;

public class C09Comments {
    public static void main(String[] args) {
        // This is a comment
        System.out.println("Hello World!"); // This is another comment
    }

    double divide(double base, int i) {
        return base / i;
    }
    double add(double sum, double divide) {
        return sum + divide;
    }

    /*
    Harmonic series is the divergent infinite series.
    This method will return sum of a harmonic series up
    to nth elements.
     */

    /**
     * Harmonic series is the divergent infinite series.
     * This method will return sum of a harmonic series up to
     * nth element.
     * @param n the length of the sum
     * @return returns the sum of the harmonic series
     */

    public double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double divide = divide(1.0,i);
            sum = add(sum, divide);
        }
        return sum;
    }

}
