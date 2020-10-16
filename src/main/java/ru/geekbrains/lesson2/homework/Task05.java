package ru.geekbrains.lesson2.homework;

import ru.geekbrains.lesson3.Singleton;

import java.util.Arrays;
import java.util.Random;

public class Task05 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));

        Singleton.getInstance();
    }

    public static void shuffle(int[] arr) {
        Random rnd = new Random();

        for (int i=0; i<arr.length; i++) {
            int ix = i + rnd.nextInt(arr.length - i);

            int tmp = arr[ix];
            arr[ix] = arr[i];
            arr[i] = tmp;
        }
    }

}
