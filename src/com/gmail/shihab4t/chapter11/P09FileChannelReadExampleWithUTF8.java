package com.gmail.shihab4t.chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class P09FileChannelReadExampleWithUTF8 {
    public static void main(String[] args) {
        Path filePath = Path.of("files/output3.txt");
        if (!Files.exists(filePath)) {
            System.out.println("The input file doesn't exit");
        }

        try (FileInputStream fis = new FileInputStream(filePath.toFile());
             FileChannel fileChannel = fis.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            Charset charset = StandardCharsets.UTF_8;

            while (fileChannel.read(buffer) > 0) {
                buffer.flip();
                CharBuffer charBuffer = charset.decode(buffer);

                while (charBuffer.hasRemaining()) {
                    char chr= charBuffer.get();
                    System.out.print(chr);
                }
                buffer.clear();
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
