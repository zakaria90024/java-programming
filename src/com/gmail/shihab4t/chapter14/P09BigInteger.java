package com.gmail.shihab4t.chapter14;

import java.math.BigDecimal;
import java.math.BigInteger;

public class P09BigInteger {
    public static void main(String[] args) {
        for (int i = 0; i <= 42; i++) {
            calculateFactorial(i);
        }


        BigInteger bigInt0 = BigInteger.ZERO;
        BigInteger bigInt1 = BigInteger.ONE;
        BigInteger bigInt10 = BigInteger.TEN;
        BigInteger aVeryLargeInt = new BigInteger("14321653165131653");
        BigInteger bigInt5 = BigInteger.valueOf(5);

        BigInteger add = bigInt1.add(bigInt0);
        BigInteger subtract = bigInt1.subtract(bigInt0);
        BigInteger multiply = bigInt1.multiply(bigInt0);
        BigInteger divide = bigInt1.divide(bigInt5);

        // more
        // abs(), and(), gcd(), remainder(), mod(), or(), xor(), andNot(), pow()
        // equals(), toString(), isProbablePrime(), nextProbablePrime()

        BigDecimal d = new BigDecimal("1115.32");
        BigDecimal taxRate = new BigDecimal("0.0049");
        BigDecimal d2 = d.multiply(taxRate);
        System.out.println(d2);
    }
    public static void calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + result);
    }
}
