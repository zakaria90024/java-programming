package com.gmail.shihab4t.chapter10.c02.input.output.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class P05WriterExample {
    public static void main(String[] args) {
        String text = """
                সকল প্রশংসা আল্লাহর জন্য যিনি তাঁর বান্দাদের প্রতি কিতাব নাযিল করেছেন,
                আর তাতে কোন বক্রতার অবকাশ রাখেননি।
                - Quran: 18:1
                """;
        try (Writer writer = new FileWriter("files/output.txt")) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
