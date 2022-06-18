package com.gmail.shihab4t.chapter11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class P06FileChannelWriteExample {
    public static void main(String[] args) {
        String data = "Write once, run anywhere (WORA)";

        Path path = Path.of("output2.txt");
        if (!Files.exists(path)) {
            System.out.println(path + " doesn't exit, please create one.");
            return;
        }
        try (FileOutputStream fos = new FileOutputStream(path.toFile());
             FileChannel fileChannel = fos.getChannel()){

            byte[] bytes = data.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(bytes);

            fileChannel.write(buffer);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
