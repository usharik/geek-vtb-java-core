package ru.geekbrains.lesson1;

import java.util.Arrays;
import java.util.Random;

public class ArraysAndLoops {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        int[] intArr1 = new int[12];

        System.out.println(intArr[0]);
        System.out.println(intArr.length); // длинна массива

        Random rnd = new Random();

        for (int i=0; i < intArr1.length; i++) {
            intArr1[i] = rnd.nextInt();
        }

        for (int item : intArr1) {
            System.out.println(item);
        }

        System.out.println(Arrays.toString(intArr));

        int val = 2;
        while (val < 100) {
            val *= 2;
        }

//        do {
//
//        } while (true);
//
//        for (;;) {
//
//        }
//
//        while (true) {
//
//        }
    }
}
