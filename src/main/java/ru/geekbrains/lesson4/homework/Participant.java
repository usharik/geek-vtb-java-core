package ru.geekbrains.lesson4.homework;

public abstract class Participant {

    private final String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
