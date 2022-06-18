package com.gmail.shihab4t.chapter07.c05.inheritance;

class Account {
    private long amount;

    public final void deposit(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }
}