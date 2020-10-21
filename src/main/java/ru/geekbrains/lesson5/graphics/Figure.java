package ru.geekbrains.lesson5.graphics;

public abstract class Figure {

    protected int x, y;

    private boolean visible;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
        this.visible = true;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    protected abstract void draw();

    public final void show() {
        if (visible) {
            draw();
        }
    }
}
