package com.gmail.shihab4t.chapter07.c05.inheritance;

class CheckingAccount {
    private final String accountNumber;
    private int balance;

    public CheckingAccount(int initialBalance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Depositing " + amount + " into account " + accountNumber);
        System.out.println("New balance: " + balance);
    }

    public void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " into account " + accountNumber);

        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("New balance: " + balance);
        }
        System.out.println();
    }

    public int getBalance() {
        return balance;
    }
}

class SavingsAccount extends CheckingAccount {
    private static final int MAX_WITHDRAWAL = 5;

    private final double interestRate;
    private int withdrawalCount;

    public SavingsAccount(int initialBalance, String accountNumber, double interestRate) {
        super(initialBalance, accountNumber);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void withdraw(int amount) {
        if (withdrawalCount == MAX_WITHDRAWAL) {
            System.out.println("Withdrawal limit exceed");
        } else {
            super.withdraw(amount);
            withdrawalCount++;
        }
    }
}
