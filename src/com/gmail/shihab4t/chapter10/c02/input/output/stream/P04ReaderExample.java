package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class P04ReaderExample {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("files/input.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
