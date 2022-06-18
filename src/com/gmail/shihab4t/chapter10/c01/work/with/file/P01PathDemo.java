package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.File;
import java.nio.file.Path;

public class P01PathDemo {
    public static void main(String[] args) {
        Path path = Path.of("README.md");
        System.out.println(path);
        
        File file = path.toFile();
        System.out.println("file = " + file);
        
        File file2 = new File("README.md");
        System.out.println("file2 = " + file2);

        String workingDir = System.getProperty("user.dir");
        String newFile = workingDir + File.separator + "README.md";
        File file3 = new File(newFile);

        Path workingDir2 = Path.of("files/hello3.txt");
        System.out.println("workingDir2 = " + workingDir2);

        Path workingDir3 = Path.of("file", "hello3.txt");
        System.out.println("workingDir3 = " + workingDir3);
    }
}
