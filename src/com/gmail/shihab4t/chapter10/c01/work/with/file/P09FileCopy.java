package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class P09FileCopy {
    public static void main(String[] args) throws IOException {
        Path copyFrom = Path.of("files/hello.txt");
        Path copyTo = Path.of("files/copied.txt");

        Files.copy(copyFrom, copyTo, StandardCopyOption.REPLACE_EXISTING);
    }
}
