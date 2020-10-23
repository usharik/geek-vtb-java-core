package ru.geekbrains.lesson4.homework;

public class Cat extends Participant implements Runable, Jumpable {

    private final int maxRunLength;
    private final int maxJumpHeight;

    public Cat(String name, int maxRunLength, int maxJumpHeight) {
        super(name);
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public int getMaxRunLength() {
        return maxRunLength;
    }
}
