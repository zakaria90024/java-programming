package com.gmail.shihab4t.chapter07.ECommerceProject;

public class Order {
    private final Customer customer;
    private final ShoppingCart shoppingCart;
    private final Transaction transaction;

    public Order(Customer customer, ShoppingCart shoppingCart, Transaction transaction) {
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.transaction = transaction;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", shoppingCart=" + shoppingCart +
                ", transaction=" + transaction +
                '}';
    }
}
