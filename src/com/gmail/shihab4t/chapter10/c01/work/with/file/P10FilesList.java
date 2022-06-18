package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class P10FilesList {
    public static void main(String[] args) throws IOException {
        Path myWorkingDir = Path.of("src/com/gmail/shihab4t");

        // Stream<Path> list = Files.list(myWorkingDir);
        // list.forEach(System.out::println);

//        File workingDirFile = myWorkingDir.toFile();
//        File[] allFiles = workingDirFile.listFiles();
//        if (allFiles != null) {
//            for (File file : allFiles) {
//                System.out.println(file.toPath());
//            }
//        }

        Stream<Path> walk = Files.walk(myWorkingDir);
        walk.forEach(System.out::println);
    }
}
