package com.gmail.shihab4t.chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class P05FileChannelReadExample {
    public static void main(String[] args) {
        Path filePath = Path.of("files/input.txt");
        if (!Files.exists(filePath)) {
            System.out.println("The input file doesn't exit");
        }
        try (FileInputStream fis = new FileInputStream(filePath.toFile());
             FileChannel fileChannel = fis.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (fileChannel.read(buffer) > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    byte b = buffer.get();
                    System.out.print((char) b);
                }
                buffer.clear();
                System.out.println();
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
