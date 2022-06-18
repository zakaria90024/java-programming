package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class P01InputStreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream in = null;

        try {
            in = new FileInputStream("files/input.txt");
            int c;
            while ((c = in.read()) != -1) {
//                System.out.print(c + ", ");
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("could not read file");
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Unable to close FileInputStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
