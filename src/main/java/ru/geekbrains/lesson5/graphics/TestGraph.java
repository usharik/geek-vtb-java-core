package ru.geekbrains.lesson5.graphics;

public class TestGraph {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Point(0,0);
        figures[1] = new Line(0, 0, 1, 1);
        figures[2] = new Point(10, 10);

        //figures[1].setVisible(false);

        for (Figure fg : figures) {
            fg.show();
        }
    }
}
