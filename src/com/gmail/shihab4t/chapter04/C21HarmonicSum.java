package com.gmail.shihab4t.chapter04;

public class C21HarmonicSum {
    public static void main(String[] args) {
        int n = 5000;
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("sum = " + sum);
    }
}
