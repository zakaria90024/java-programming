package com.gmail.shihab4t.chapter11;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class P02BufferInfo {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(8);
        System.out.println("Capacity: " + bb.capacity());
        System.out.println("Limit: " + bb.limit());
        System.out.println("Position: " + bb.position());

        // Thw mark is not set for a new buffer
        // Calling the reset() method throws
        // a runtime exception if the mark is not
        // set. If the mark is set, the position
        // is set to mark value
        try {
            bb.reset();
            System.out.println("Mark: " + bb.position());
        } catch (InvalidMarkException err) {
            System.out.println("Mark is not set");
        }
    }
}
