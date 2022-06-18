package com.gmail.shihab4t.chapter11;

import java.nio.ByteBuffer;

public class P03BufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(8);
        System.out.println("Right After Creation: ");
        printBuffer(bb);
        for (int i = 0; i < 8; i++) {
            bb.put((byte) i);
        }
        System.out.println("After populating Data: ");
        printBuffer(bb);
    }

    public static void printBuffer(ByteBuffer bb) {
        int limit = bb.limit();
        System.out.println("Position: " + bb.position() + ", " + "limit: " + limit);
        System.out.println("Data: ");
        for (int i = 0; i < limit; i++ ) {
            System.out.print(bb.get(i) + " ");
        }
        System.out.println();
    }
}
