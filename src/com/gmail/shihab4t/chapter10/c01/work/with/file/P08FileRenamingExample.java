package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class P08FileRenamingExample {
    public static void main(String[] args) throws IOException {
        Path oldFilepath = Path.of("files/hello.txt");
        Path targetPath = Path.of("files/hello_renamed.txt");

        Path moved = Files.move(oldFilepath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(moved);

        Files.delete(targetPath);
    }
}
