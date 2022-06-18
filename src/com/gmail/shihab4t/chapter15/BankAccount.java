package com.gmail.shihab4t.chapter15;

import java.math.BigDecimal;
import java.text.DecimalFormat;





public class BankAccount {
    private final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");

    private BigDecimal balance;

    public BankAccount(double initialBalance) {
        this();
        deposit(initialBalance);
    }

    public BankAccount() {
        balance = BigDecimal.ZERO;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount must not negative");
        }
        this.balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount must not negative");
        }
        BigDecimal amountToWithdraw = BigDecimal.valueOf(amount);
        if (amountToWithdraw.compareTo(balance) > 0) {
            throw new NotSufficientBalanceException("Not sufficient amount to withdraw");
        }

        balance = balance.subtract(amountToWithdraw);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "The available balance is " + MONEY.format(balance);
    }
}
