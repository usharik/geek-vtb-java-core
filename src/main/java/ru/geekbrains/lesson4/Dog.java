package ru.geekbrains.lesson4;

public class Dog extends Pet {

    public Dog(String name, int age, Human human) {
        super(name, age, human);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }
}
