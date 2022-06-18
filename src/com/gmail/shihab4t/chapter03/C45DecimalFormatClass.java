package com.gmail.shihab4t.chapter03;

import java.text.DecimalFormat;

public class C45DecimalFormatClass {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("৳#.##");
        double amount = 15_000.12560;
        String formattedAmount = decimalFormat.format(amount);
        System.out.println(formattedAmount);
    }
}
