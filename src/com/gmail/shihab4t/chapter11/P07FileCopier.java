package com.gmail.shihab4t.chapter11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class P07FileCopier {
    public static void main(String[] args) {
        Path sourcePath = Path.of("files/hello.txt");
        Path destinationPath = Path.of("files/hello2.txt");

        copy(sourcePath, destinationPath);
    }
    public static void copy(Path sourcePath, Path destinationPath) {
        if (!Files.exists(sourcePath) | !Files.exists(destinationPath)) {
            System.out.println("source or destination file " + "does not exits");
            return;
        }
        try (FileChannel srcChannel = new FileInputStream(sourcePath.toFile()).getChannel();
        FileChannel sinkChannel = new FileOutputStream(destinationPath.toFile()).getChannel()) {
            srcChannel.transferTo(0, srcChannel.size(), sinkChannel);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
