package com.gmail.shihab4t.chapter10.c01.work.with.file;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;

public class P11FileFiltering {
    public static void main(String[] args) {
        Path pictureDir = Path.of("/home/shihab4t/Pictures");

        FileFilter pngFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
                return fileName.endsWith(".png");
            }
        };
        File pictureDirFile = pictureDir.toFile();
        File[] listRoots = pictureDirFile.listFiles(pngFilter);
        if (listRoots != null) {
            for (File file : listRoots) {
                System.out.println(file.getPath());
            }
        }

    }
}
