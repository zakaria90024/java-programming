package com.gmail.shihab4t.chapter12;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class P17UniqueNameFinder {
    public static void main(String[] args) throws IOException {
        var path = Path.of("files/names.txt");
        if (!Files.exists(path)) {
            throw new FileNotFoundException(path + " doesn't exits");
        }

        String textInFile = Files.readString(path);
        String[] names = textInFile.split(",");

        Set<String> nameSet = new HashSet<>();
        for (String name: names) {
            nameSet.add(name);
        }
        System.out.println("Unique names: " + nameSet);
    }
}
