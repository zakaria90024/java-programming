package com.gmail.shihab4t.chapter07.HumanManagement;

public class Main {
    public static void main(String[] args) {
        PayCalculator calculator = new FixedPayCalculator(75);
        HrManager hrManager = new HrManager(calculator);
        
        Client client0 = new Client("Mosharraf", 45);
        hrManager.addClient(client0);

        Client client1 = new Client("Nowshed", 45);
        hrManager.addClient(client1);
        
        double fixedTotalPay = hrManager.getTotalPay();
        System.out.println("fixedTotalPay = " + fixedTotalPay);
    }
}
