package com.gmail.shihab4t.chapter16.appendix;

public class P02ComputeArea {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Run this program again with an argument");
            return;
        }
        String arg0 = args[0];
        int radius = Integer.parseInt(arg0);
        double area = radius * radius * Math.PI;
        System.out.println("area = " + area);
    }
}
