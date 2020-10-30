package ru.geekbrains.lesson9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileOutput {

    public static void main(String[] args) {
        try {
            File file = new File("output_file.txt");
            file.createNewFile();

            BufferedWriter writer =
                            new BufferedWriter(
                                    new FileWriter(file));

            writer.write("first line\n");
            writer.write("second line\n");
            writer.write("third line\n");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
