package com.gmail.shihab4t.chapter07.c04.encapsulation;

class Random {
    static final int p1 = 32719; // a prime number
    static final int p2 = 32749; // another prime number

    int max;
    int last;

    public Random(int max) {
        this.max = max;
    }

    int nextInt() {
        last = (last * p1 + 3) % p2;
        return last % max;
    }
}