package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class P02IsFileExist {
    public static void main(String[] args) {
        Path path = Path.of("README.md");
        boolean exists = Files.exists(path);
        System.out.println("exists = " + exists);

        // or
        File newFile = new File("README.md");
        boolean exists2 = newFile.exists();
        System.out.println("exists2 = " + exists2);

        boolean isDirectory = Files.isDirectory(path);
        System.out.println("isDirectory = " + isDirectory);
    }
}
