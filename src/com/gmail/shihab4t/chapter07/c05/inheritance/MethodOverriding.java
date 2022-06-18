package com.gmail.shihab4t.chapter07.c05.inheritance;

class Calculator {
    // other = methods

    public int add(int a, int b) {
        return a + b;
    }
}

class AdvanceCalculator extends Calculator{
    @Override
    public int add(int a, int b) {
        int r = a + b;
        // Hacker's delight- 2-13 OVERFLOW DETECTION
        // iff both argument have the opposite sign of the result
        if (((a ^ r) & (b ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }
}
