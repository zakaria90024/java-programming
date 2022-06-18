package com.gmail.shihab4t.chapter13;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class P26Instant {
    public static void main(String[] args) {
        Instant start = Instant.now();

        findPrimeNumber(100);

        Instant end = Instant.now();

        Duration elapsedTime = Duration.between(start, end);
        long millis = elapsedTime.toMillis();
        System.out.println("elapsedTime = " + millis);
    }

    private static void findPrimeNumber(int n) {
        BigInteger prime = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            prime = prime.nextProbablePrime();
        }
        System.out.println(n + "'th prime number is: " + prime);
    }
}
