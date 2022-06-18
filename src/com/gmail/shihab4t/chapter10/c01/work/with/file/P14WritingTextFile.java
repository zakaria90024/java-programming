package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P14WritingTextFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/home/shihab4t/Desktop/test_from_java.java");
        String code = """
                public class Hello {
                    public static void main(String[] args) {
                        System.out.println("Hello world!");
                    }
                }
                """;
        Files.writeString(path, code);
    }
}
