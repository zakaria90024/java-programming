package com.gmail.shihab4t.chapter07.c07.exercises;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Account {
    private final String accountNo;
    private String password;

    public Account(String accountNo, String password) {
        this.accountNo = accountNo;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public String getPassword() {
        return this.password;
    }
}

class AccountList {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void add(Account account) {
        accounts.add(account);
    }

    public boolean matchAccount(Account account) {
        for (Account account1 : accounts) {
            if (Objects.equals(account.getAccountNo(), account1.getAccountNo())) {
                if (Objects.equals(account.getPassword(), account1.getPassword())) {
                    System.out.println("Login successful");
                    return true;
                } else {
                    System.out.println("Your password wrong");
                    return false;
                }
            }
        }
        System.out.println("There is no account with this " + account.getAccountNo() + " account number");
        return false;
    }
}

class MainManu {
    public static void print() {
        System.out.println("""
                1: Check Balance
                2: Withdraw
                3: Deposit
                4: Exit
                """);
    }


}

class UseATM {
    public static void main(String[] args) {
        AccountList accountList = new AccountList();

        Account ac1 = new Account("12462486", "2611");
        accountList.add(ac1);

        System.out.println("Enter you account no: ");
        Scanner input = new Scanner(System.in);
        String accountNo = input.nextLine();
        System.out.println("Enter you password: ");
        String password = input.nextLine();

        if (accountList.matchAccount(new Account(accountNo, password))) {
            MainManu.print();
            System.out.println("Enter choice: ");
            int choice = input.nextInt();
        }
    }
}
