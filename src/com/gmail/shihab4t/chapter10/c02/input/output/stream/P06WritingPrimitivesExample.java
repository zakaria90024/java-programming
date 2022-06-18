package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P06WritingPrimitivesExample {
    public static void main(String[] args) {
        String fileName = "files/primitives.data";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(152);
            dos.writeDouble(4.24);
            dos.writeBoolean(true);
            dos.writeLong(Long.MAX_VALUE);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
