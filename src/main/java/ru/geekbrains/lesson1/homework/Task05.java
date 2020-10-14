package ru.geekbrains.lesson1.homework;

import java.util.Arrays;

public class Task05 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1};
        invert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void invert(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
//            if (arr[i] == 0) {
//                arr[i] = 1;
//            } else {
//                arr[i] = 0;
//            }
        }
    }
}
