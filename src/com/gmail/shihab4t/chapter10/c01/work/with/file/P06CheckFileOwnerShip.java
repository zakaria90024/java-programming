package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.UserPrincipal;

public class P06CheckFileOwnerShip {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("files/hello.txt");
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);
    }
}
