package com.gmail.shihab4t.chapter08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class C03TryBlockDemo {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet.";

        try {
            System.out.println("Entered on try block");

            Files.writeString(Path.of("files/file.txt"), text, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println("Entered on catch block");
            e.printStackTrace();
        }
        System.out.println("Program terminated");
    }
}
