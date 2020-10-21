package ru.geekbrains.lesson5.graphics;

public class Line extends Figure {

    protected final int x1, y1;

    public Line(int x, int y, int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    protected void draw() {
        System.out.printf("Линия: [%d, %d] -> [%d, %d]%n", x, y, x1, y1);
    }
}
