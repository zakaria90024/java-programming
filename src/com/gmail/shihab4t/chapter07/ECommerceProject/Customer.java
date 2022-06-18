package com.gmail.shihab4t.chapter07.ECommerceProject;

import java.util.UUID;
import java.util.stream.Stream;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int cvv, String validThrough) {
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, validThrough);
    }

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }

    public Order checkout(ShoppingCart cart) {
        Transaction transaction = makePayment(cart);

        return new Order(this, cart, transaction);
    }

    private Transaction makePayment(ShoppingCart cart) {
        // making payment with credit card
        // for simplicity, ignoring the credit application here
        return new Transaction(UUID.randomUUID(), cart.getTotalPrice());
    }
}
