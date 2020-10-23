package ru.geekbrains.lesson4.homework;

public interface Swimable {

    int STATIC_FIELD = 1;

    default int getMaxSwimLength() {
        return 0;
    }

    static void staticMethod() {

    }
}
