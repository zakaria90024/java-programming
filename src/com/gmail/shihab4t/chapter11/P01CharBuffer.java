package com.gmail.shihab4t.chapter11;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class P01CharBuffer {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(10);
        int capacity = charBuffer.capacity();
        byte[] bytes = new byte[10];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(512);

    }
}
