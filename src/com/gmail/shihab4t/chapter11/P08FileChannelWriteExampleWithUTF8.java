package com.gmail.shihab4t.chapter11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class P08FileChannelWriteExampleWithUTF8 {
    public static void main(String[] args) {
        String data = """
                সকল প্রশংসা আল্লাহর জন্য যিনি তাঁর বান্দাদের প্রতি কিতাব নাযিল করেছেন,
                আর তাতে কোন বক্রতার অবকাশ রাখেননি।
                - Quran: 18:1
                """;
        Path path = Path.of("files/output3.txt");
        if (!Files.exists(path)) {
            System.out.println(path + " doesn't exit, please create one.");
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(path.toFile());
             FileChannel fileChannel = fos.getChannel()) {
            Charset charset = StandardCharsets.UTF_8;

            CharBuffer charBuffer = CharBuffer.wrap(data);
            ByteBuffer encodedBuffer = charset.encode(charBuffer);
            fileChannel.write(encodedBuffer);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
