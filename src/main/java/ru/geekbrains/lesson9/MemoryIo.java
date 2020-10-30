package ru.geekbrains.lesson9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MemoryIo {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
        int val;
        while ((val = inputStream.read()) != -1) {
            System.out.println(val);
        }
    }
}
