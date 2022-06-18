package com.gmail.shihab4t.chapter16.appendix;

public class P12CopyConstructor {
    public static void main(String[] args) {
        P11Point point = new P11Point(1, 3);
        P11Point clone = new P11Point(point);
    }
}
