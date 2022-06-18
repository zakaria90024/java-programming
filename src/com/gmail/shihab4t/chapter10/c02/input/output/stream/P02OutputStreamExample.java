package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class P02OutputStreamExample {
    public static void main(String[] args) {
        String destination =  "files/output.txt";
        String data = "I love C/C++ Programming!";

        OutputStream fos = null;
        try {
            fos = new FileOutputStream(destination);
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            System.err.println("Unable to write text in " + destination);
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.err.println("Unable to close the OutputStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
