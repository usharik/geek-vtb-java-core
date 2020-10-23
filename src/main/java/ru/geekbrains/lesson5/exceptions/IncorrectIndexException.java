package ru.geekbrains.lesson5.exceptions;

public class IncorrectIndexException extends RuntimeException {

    public IncorrectIndexException(String error) {
        super(error);
    }
}
