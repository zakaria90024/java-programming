package com.gmail.shihab4t.chapter16.appendix;

public class P23Fibonacci {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        P23Fibonacci fibonacci = new P23Fibonacci();
        System.out.println(fibonacci.fib(5));
        System.out.println(fibonacci.fib(0));
        System.out.println(fibonacci.fib(1));
        System.out.println(fibonacci.fib(7));
    }
}
