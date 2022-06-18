package com.gmail.shihab4t.chapter15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.math.BigDecimal;


class BankAccountTest {
    @Test
    @DisplayName("Bank account should be created without initial balance")
    public void TestBankAccountCreationWithoutInitialBalance() {
        BankAccount account = new BankAccount();
        Assertions.assertNotNull(account);
    }

    @Test
    @DisplayName("Bank account should be created wit h initial balance 10.50")
    void TestBankAccountCreationWithInitialBalance() {
        BankAccount account = new BankAccount(10.50);
        Assertions.assertNotNull(account);

        Assertions.assertEquals(BigDecimal.valueOf(10.50), account.getBalance());
    }

    @Test
    @DisplayName("Bank account should not be created with negative initial balance")
    public void testBankAccountCreationWithNegativeInitialBalance() {
        Exception exception = Assertions.assertThrows(NegativeAmountException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                BankAccount account = new BankAccount(-10.50);
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Deposit amount must not negative");
    }

    @Test
    @DisplayName("Amount can be deposited to the bank account")
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.50);
        Assertions.assertEquals(BigDecimal.valueOf(100.50), account.getBalance());
    }

    @Test
    @DisplayName("negative amount can not be deposited to the bank account")
    public void testDepositWithNegativeAmount() {
        BankAccount account = new BankAccount();
        Exception exception = Assertions.assertThrows(NegativeAmountException.class, () -> {
            account.deposit(-100.50);
        });
        Assertions.assertEquals(exception.getMessage(), "Deposit amount must not negative");
    }

    @Test
    @DisplayName("Amount can be withdrawn to the bank account")
    public void testWithdraw() {
        BankAccount account = new BankAccount(100.50);
        account.withdraw(50);
        Assertions.assertEquals(BigDecimal.valueOf(50.50), account.getBalance());
    }

    @Test
    @DisplayName("Negative amount can be withdrawn to the bank account")
    public void testWithdrawWithNegativeAmount() {
        BankAccount account = new BankAccount(100.50);
        Exception exception = Assertions.assertThrows(NegativeAmountException.class, () -> {
            account.withdraw(-100.50);
        });

        Assertions.assertEquals(exception.getMessage(), "Withdrawal amount must not negative");
    }

    @Test
    @DisplayName("Withdrawal amount can not be more then available balance")
    public void testWithdrawWithALargeAmount() {
        BankAccount account = new BankAccount(10.50);
        Exception exception = Assertions.assertThrows(NotSufficientBalanceException.class, () -> {
            account.withdraw(100.50);
        });

        Assertions.assertEquals(exception.getMessage(), "Not sufficient amount to withdraw");
    }

    @Test
    @DisplayName("To string of account should formatted upt to 2 decimal value with $ sign")
    public void testToString() {
        BankAccount account = new BankAccount(10.50);
        String formattedBalance = account.toString();
        Assertions.assertEquals("The available balance is $10.50", formattedBalance);
    }
}