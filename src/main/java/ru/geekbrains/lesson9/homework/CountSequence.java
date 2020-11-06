package ru.geekbrains.lesson9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


public class CountSequence {

    public static int countSequence(Path path, String sequence) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int nextChar;
            while ((nextChar = reader.read()) != -1) {
                if (sb.length() < sequence.length()) {
                    sb.append((char) nextChar);
                    continue;
                } else if (sb.toString().equals(sequence)) {
                    count++;
                }
                sb.deleteCharAt(0);
                sb.append((char) nextChar);
            }
            if (sb.toString().equals(sequence)) {
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countSequence(Path.of("some_data_file.txt"), "aaa"));
    }
}
