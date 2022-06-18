package com.gmail.shihab4t.chapter07.PaymentSystem;

public class PaymentEngineDemo {

    public static void main(String[] args) {
        PaymentEngine paymentEngine = new PaymentEngine();

        BkashPayment bkashPayment = new BkashPayment(100);
        paymentEngine.accept(bkashPayment);

        CashPayment cashPayment = new CashPayment(150);
        paymentEngine.accept(cashPayment);
    }
}
