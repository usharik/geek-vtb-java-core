package ru.geekbrains.lesson5.enums;

public class ClassWithState {

    private static State state = State.CREATED;

    public static void main(String[] args) {
        State closed = State.valueOf("CLOSED");
        System.out.println(closed);

        if (closed == State.CLOSED) {

        }

        for (State state : State.values()) {
            System.out.println(state + " : " + state.getDescription());
        }
    }
}
