package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class P12FileFilteringLambda {
    public static void main(String[] args) throws IOException {
        Path pictureDir = Path.of("/home/shihab4t/Pictures");

//        Stream<Path> filteredPath = Files.list(pictureDir)
//                .filter(file -> file.toString().endsWith(".png"));
//        filteredPath.forEach(filePath -> {
//            System.out.println(filePath);
//        });
        Files.list(pictureDir).filter(file -> file.toString()
                .endsWith(".png")).forEach(System.out::println);
    }
}
