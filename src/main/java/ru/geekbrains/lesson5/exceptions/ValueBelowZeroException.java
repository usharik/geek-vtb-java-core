package ru.geekbrains.lesson5.exceptions;

public class ValueBelowZeroException extends Exception {

    public ValueBelowZeroException(String error) {
        super(error);
    }
}
