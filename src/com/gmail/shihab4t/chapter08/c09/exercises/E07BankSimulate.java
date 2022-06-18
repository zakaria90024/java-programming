package com.gmail.shihab4t.chapter08.c09.exercises;

class Account {
    private final String name;
    private final String id;
    private String password;
    private long amount;

    private void is_valid(long amount) throws CantInputNegativeException {
        if (amount < 0) {
            throw new CantInputNegativeException();
        }
    }

    private void is_valid2(long amount) {
        try {
            is_valid(amount);
        } catch (CantInputNegativeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Account(String name, String id, String password, long amount) {
        this.name = name;
        this.id = id;
        this.password = password;
        is_valid2(amount);
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public long getAmount() {
        return amount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addAmount(long amount) {
        is_valid2(amount);
        this.amount += amount;
    }

    public void removeAmount(long amount) {
        is_valid2(amount);
        this.amount -= amount;
    }
}

class CantInputNegativeException extends Exception {
    @Override
    public String getMessage() {
        return "You can't input Negative";
    }
}

class Main {
    public static void main(String[] args) {
        Account ac1 = new Account("Shiab Mahamud", "12345", "2611", 500);
        ac1.addAmount(250);
        ac1.addAmount(-120);
    }
}
