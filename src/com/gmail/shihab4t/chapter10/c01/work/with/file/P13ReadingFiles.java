package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P13ReadingFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("README.md");
        String text = Files.readString(path);
        System.out.println(text);

        Path photoPath = Path.of("/home/shihab4t/Pictures/d.png");
        byte[] allBytes = Files.readAllBytes(photoPath);
    }
}
