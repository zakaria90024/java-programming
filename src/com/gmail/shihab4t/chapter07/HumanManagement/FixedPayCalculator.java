package com.gmail.shihab4t.chapter07.HumanManagement;

public class FixedPayCalculator implements PayCalculator {
    private double fixedPay;

    public FixedPayCalculator(double fixedPay) {
        this.fixedPay = fixedPay;
    }

    @Override
    public double getPay(Client client) {
        return fixedPay;
    }
}
