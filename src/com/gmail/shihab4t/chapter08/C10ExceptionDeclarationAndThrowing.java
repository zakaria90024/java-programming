package com.gmail.shihab4t.chapter08;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;

import static java.io.File.separatorChar;


public class C10ExceptionDeclarationAndThrowing {
    public static Path writeString(Path path, CharSequence csq, OpenOption... openOptions) throws IOException {
//        return writeString(path, csq, UTF_8.INSTANCE, openOptions);
        return null;
    }

    private synchronized void readObject(java.io.ObjectInputStream s) throws IOException, ClassNotFoundException {
        ObjectInputStream.GetField fields = s.readFields();
        String pathField = (String) fields.get("path", null);
        char sep = s.readChar(); // read the previous separator char
        if (sep != separatorChar) {
            pathField = pathField.replace(sep, separatorChar);
        }
//        String path = fs.normalize(pathField);
//        UNSAFE.putReference(this, PATH_OFFSET, path);
//        UNSAFE.putIntVolatile(this, PREFIX_LENGTH_OFFSET, fs.perfixLength(path));
    }
}

class Calculator {
    public int divide(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Argument b cannot be negative");
        }
        return a / b;
    }
}

