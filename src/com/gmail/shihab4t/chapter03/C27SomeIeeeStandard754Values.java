package com.gmail.shihab4t.chapter03;

public class C27SomeIeeeStandard754Values {
    public static void main(String[] args) {
        double zero = 1.000011;
        System.out.println("zero = " + zero);
        
        double Infinity = Double.MAX_VALUE * 2;
        System.out.println("Infinity = " + Infinity);
        
        double NotANumber = 0/0;
        System.out.println("NotANumber = " + NotANumber);
    }
}
