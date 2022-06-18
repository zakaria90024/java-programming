package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P07ReadingPrimitivesExample {
    public static void main(String[] args) {
        String fileName = "files/primitives.data";
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            long longValue = dis.readLong();

            System.out.println(intValue);
            System.out.println(doubleValue);
            System.out.println(booleanValue);
            System.out.println(longValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
