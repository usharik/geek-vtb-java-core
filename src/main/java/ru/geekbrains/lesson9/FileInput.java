package ru.geekbrains.lesson9;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class FileInput {

    public static void main(String[] args) {
        File file = new File("/Users/macbook/Downloads/geek-vtb-java-core/src/main/java/ru/geekbrains/lesson9/FileIo.java");
        if (file.exists()) {
            System.out.println("Файл существует");
        }

        if (Files.exists(Path.of("/Users/macbook/Downloads/geek-vtb-java-core/src/main/java/ru/geekbrains/lesson9/FileIo.java"))) {
            System.out.println("Файл существует");
        }

        try {
            Reader reader =
                    new InputStreamReader(
                            new BufferedInputStream(
                                    new FileInputStream(file)), StandardCharsets.UTF_8);
            int nextByte;
            while ((nextByte = reader.read()) != -1) {
                System.out.print((char) nextByte);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("/Users/macbook/Downloads/geek-vtb-java-core/src/main/java/ru/geekbrains/lesson9/FileIo.java"));

            while (reader.ready()) {
                reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner =
                    new Scanner(
                            new FileReader("/Users/macbook/Downloads/geek-vtb-java-core/src/main/java/ru/geekbrains/lesson9/FileIo.java"));

            int nextInt = scanner.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
