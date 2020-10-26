package ru.geekbrains.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        intArr[1] = 11;

        // 1, 2, 4, 5, 6

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> integers = List.of(1, 2, 3, 4);
        List<Number> list1 = List.of(1, 1L, 1.2f, 4.5d, (byte) 12);

        List<Integer> list = new ArrayList<>();
        list.add(11);
        System.out.println(list.get(0));
        list.set(0, 55);
        list.add(12);
        list.add(15);
        list.remove(0);


    }
}
