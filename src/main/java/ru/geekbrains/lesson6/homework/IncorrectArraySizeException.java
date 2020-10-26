package ru.geekbrains.lesson6.homework;

public class IncorrectArraySizeException extends Exception {

    private int ix;

    private int length;

    public IncorrectArraySizeException(int ix, int length) {
        super(String.format("Не правильная размерность подмассива %d - [%d]", ix, length));
        this.ix = ix;
        this.length = length;
    }

    public IncorrectArraySizeException(int length) {
        super(String.format("Не правильная основная размерность массива [%d]", length));
    }

    public int getIx() {
        return ix;
    }

    public int getLength() {
        return length;
    }
}
