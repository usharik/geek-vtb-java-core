package ru.geekbrains.lesson4;

public class Hamster extends Pet {

    public Hamster(String name, int age, Human human) {
        super(name, age, human);
    }

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Пиииии");
    }
}
