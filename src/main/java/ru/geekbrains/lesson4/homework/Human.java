package ru.geekbrains.lesson4.homework;

public class Human extends Participant implements Runable, Jumpable, Swimable {

    private final int maxRunLength;
    private final int maxJumpHeight;
    private final int maxSwimLength;

    public Human(String name, int maxRunLength, int maxJumpHeight, int maxSwimLength) {
        super(name);
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimLength = maxSwimLength;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public int getMaxRunLength() {
        return maxRunLength;
    }

    @Override
    public int getMaxSwimLength() {
        return maxSwimLength;
    }
}
