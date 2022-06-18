package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class P03TryWithResourceExample {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("files/input.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println("Could not read file");
            e.printStackTrace();
        }
    }
}
