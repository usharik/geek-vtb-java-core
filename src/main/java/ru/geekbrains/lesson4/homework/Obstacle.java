package ru.geekbrains.lesson4.homework;

public abstract class Obstacle {

    private final String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canPass(Participant participant);
}
