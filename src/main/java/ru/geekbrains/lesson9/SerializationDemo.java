package ru.geekbrains.lesson9;

import ru.geekbrains.lesson8.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {

        if (!Files.exists(Path.of("person_storage.bin"))) {
            Files.createFile(Path.of("person_storage.bin"));

            ObjectOutputStream outputStream =
                    new ObjectOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream("person_storage.bin")));

            outputStream.writeObject(new Person("asdasd1", "dasdasd1"));
            outputStream.writeObject(new Person("asdasd2", "dasdasd2"));
            outputStream.writeObject(new Person("asdasd3", "dasdasd3"));
            outputStream.close();
        } else {
            ObjectInputStream inputStream = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("person_storage.bin")));

            try {
                while (true) {
                    Person person = (Person) inputStream.readObject();
                    System.out.println(person);
                }
            } catch (EOFException ex) {
                System.out.println("Все данные считаны");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}
