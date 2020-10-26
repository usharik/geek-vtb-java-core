package ru.geekbrains.lesson6.homework;

public class ArrayDataException extends Exception {

    private int ix;
    private int jx;
    private String value;

    public ArrayDataException(int ix, int jx, String value) {
        super(String.format("Не корректное значение элемента [%d][%d] - %s", ix, jx, value));
        this.ix = ix;
        this.jx = jx;
        this.value = value;
    }

    public int getIx() {
        return ix;
    }

    public int getJx() {
        return jx;
    }

    public String getValue() {
        return value;
    }
}
