package com.gmail.shihab4t.chapter11;

import java.nio.CharBuffer;

public class P04CharBufferReadWrite {
    public static void main(String[] args) {
        CharBuffer cb = CharBuffer.allocate(8);
        System.out.println("Right After Creation: ");
        printBuffer(cb);
        for (int i = 65; i < 73; i++) {
            cb.put((char) i);
        }
        System.out.println("After populating Data");
    }
    public static void printBuffer(CharBuffer cb) {
        int limit = cb.limit();
        System.out.println("Position: " + cb.position() + ", " + "limit: " + limit);
        for (int i =0; i < limit; i++) {
            System.out.print(cb.get(i) + " ");
        }
        System.out.println();
    }
}
