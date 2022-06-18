package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class P07CreateDirectoryWithPermissions {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("myDir");
        
        if (!Files.exists(path)) {
            Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rwxr--r--");
            FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions);
            
            Files.createDirectory(path, fileAttributes);
        }
        
        var posixFilePermissions = Files.getPosixFilePermissions(path);
        System.out.println("posixFilePermissions = " + posixFilePermissions);
    }
}
