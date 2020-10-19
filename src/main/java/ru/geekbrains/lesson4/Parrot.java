package ru.geekbrains.lesson4;

public class Parrot extends Pet {

    public Parrot(String name, int age, Human human) {
        super(name, age, human);
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Попка дурак");
    }
}
