package ru.geekbrains.lesson7.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list = new ArrayList<>();

    public void add(T... fruits) {
        list.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        if (list.size() == 0) {
            return 0;
        }

        double weight = 0;
        for (T fruit : list) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        // box.add(new Apple(), new Orange());
        return this.getWeight() == box.getWeight();
    }

    public void moveTo(Box<T> box) {
        box.add(list.toArray((T[]) new Object[0]));
        list.clear();
    }

}
