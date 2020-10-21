package ru.geekbrains.lesson5.graphics;

public class Point extends Figure {

    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    protected void draw() {
        System.out.printf("Точка: %d, %d%n", x, y);
    }
}
