package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P03FileCreation {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("files/hello2.txt");
        
        Path file = Files.createFile(filePath);
        System.out.println("file = " + file);
    
        boolean exists = Files.exists(file);
        System.out.println("exists = " + exists);
        
        // or
        File myFile = new File("files/hello3.txt");
        boolean hasFileCreated = myFile.createNewFile();
        System.out.println("hasFileCreated = " + hasFileCreated);


        Path filePath2 = Path.of("files/hello2.txt");
        if (!Files.exists(filePath2)) {
            Path file2 = Files.createFile(filePath);
            System.out.println("file2 = " + file2);
        }
    }
}
