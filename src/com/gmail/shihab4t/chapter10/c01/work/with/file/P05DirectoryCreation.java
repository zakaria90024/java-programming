package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P05DirectoryCreation {
    public static void main(String[] args) throws IOException {
        Path myFolder = Path.of("myFolder");

        if (!Files.exists(myFolder)) {
            Path directory = Files.createDirectory(myFolder);
        }

        // or
        File file = new File("anotherDir");
        file.mkdir();
    }
}
