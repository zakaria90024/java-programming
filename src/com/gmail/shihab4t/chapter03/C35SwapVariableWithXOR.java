package com.gmail.shihab4t.chapter03;

public class C35SwapVariableWithXOR {
    public static void main(String[] args) {
        int x = 20;
        int y = 22;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }
}
