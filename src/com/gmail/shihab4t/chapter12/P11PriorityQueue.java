package com.gmail.shihab4t.chapter12;

import java.util.*;

class Customer implements  Comparable<Customer> {
    private final  String name;
    private final  int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(o.age, this.age);
    }
}


public class P11PriorityQueue {
    public static void main(String[] args) {
        Queue<Customer> customers = new PriorityQueue<>();

        customers.add(new Customer("Customer 1", 14));
        customers.add(new Customer("Customer 2", 135));
        customers.add(new Customer("Customer 3", 15));
        customers.add(new Customer("Customer 4", 12));
        customers.add(new Customer("Customer 5", 40));

        while (!customers.isEmpty()) {
            var customer = customers.poll();
            serve(customer);
        }
    }

    private static void serve(Customer customer) {
        System.out.println("Serving customer - name: " + customer.getName() + " , age: " + customer.getAge());
    }
}
