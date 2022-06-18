package com.gmail.shihab4t.chapter15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    public void givenTwoInts_ShouldReturnResultAddingThem() {
        Calculator calculator = new Calculator();
        int a = 6, b = 7;
        int actualResult = calculator.add(a, b);

        Assertions.assertEquals(13, actualResult);
    }

    @Test
    @DisplayName("given two ints, should return them by adding")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 6, b = 7;
        int actualResult = calculator.add(a, b);

        Assertions.assertEquals(13, actualResult);
    }

    @Test
    @DisplayName("Given array of zeros, should return zero")
    void testAddWithZeros() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(new int[]{0, 0, 0});
        Assertions.assertEquals(0, actual);
    }

    @Test
    @DisplayName("Given array of ints, should return by adding the numbers")
    void testAddWithInts() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(new int[]{1, 2, 3, 4, -5});
        Assertions.assertEquals(5, actual);
    }
}