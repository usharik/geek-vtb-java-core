package ru.geekbrains.lesson4.homework;

public class Robot extends Participant implements Runable {

    private final int maxRunLength;

    public Robot(String name, int maxRunLength) {
        super(name);
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int getMaxRunLength() {
        return maxRunLength;
    }
}
