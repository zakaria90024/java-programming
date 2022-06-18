package com.gmail.shihab4t.chapter12;

import java.io.*;
import java.math.BigInteger;
import java.nio.file.*;
import java.security.*;
import java.util.*;

public class P22DuplicateFileFinder {
    public static Map<String, List<Path>> findDuplicate(Path rootPath) {
        Map<String, List<Path>> duplicateFileMap = new HashMap<>();

        Deque<Path> stack = new ArrayDeque<>();
        stack.push(rootPath);

        while (!stack.isEmpty()) {
            Path currentFile = stack.pop();

            if (Files.isDirectory(currentFile)) {
                for (File file : Objects.requireNonNull(currentFile.toFile().listFiles())) {
                    stack.push(file.toPath());
                }
            } else {
                String hash = hash(currentFile);
                List<Path> duplicates = duplicateFileMap.containsKey(hash) ? duplicateFileMap.get(hash) : new ArrayList<>();

                duplicates.add(currentFile);
                duplicateFileMap.put(hash, duplicates);
            }
        }

        return duplicateFileMap;
    }
    public static String hash(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);

            return new BigInteger(1, digest).toString(16);
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String hashForLargeFile(Path rootPath) {
        try {
            InputStream stream = new FileInputStream(rootPath.toFile());
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] buffer = new byte[10_000];

            int read = 0;
            while ((read = stream.read(buffer)) != 1) {
                md.update(buffer, 0, read);
            }

            return new BigInteger(1, md.digest()).toString(16);
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Map<String, List<Path>> dupFiles = findDuplicate(Path.of("files/dir"));

        System.out.println("duplicate files: ");
        Collection<List<Path>> values = dupFiles.values();
        for (List<Path> value : values) {
            System.out.println(value);
        }
    }
}
