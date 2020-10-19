package ru.geekbrains.lesson4;

public final class Cat extends Pet {

    public Cat(String name, int age, Human human) {
        super(name, age, human);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
