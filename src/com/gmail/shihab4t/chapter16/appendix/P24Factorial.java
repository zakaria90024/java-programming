package com.gmail.shihab4t.chapter16.appendix;

public class P24Factorial {
    public int fac(int n) {
        if (n == 1) return 1;
        return n * fac(n-1);
    }

    public static void main(String[] args) {
        P24Factorial factorial = new P24Factorial();
        System.out.println("5! = " + factorial.fac(5));
    }
}
