package ru.geekbrains.lesson9.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class JoinFiles {

    public static void joinTextFiles(Path directory, Path fileToJoin) throws IOException {
        Files.createFile(fileToJoin);
        try (BufferedWriter writer = Files.newBufferedWriter(fileToJoin, StandardCharsets.UTF_8)) {
            for (File file : directory.toFile().listFiles()) {
                if (!file.isDirectory()) {
                    try (Reader reader = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
                        reader.transferTo(writer);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        joinTextFiles(Path.of("/Users/macbook/Downloads/geek-vtb-java-core"), Path.of("join.txt"));
    }
}
