package ru.geekbrains.lesson1.homework;

import java.util.Arrays;

public class Task08 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 1, 1}, {1, 1}, {}, {1, 1, 1, 1, 1}};

        int[][] arr = new int[11][11];
        fillDiags(arr);
        System.out.println(Arrays.deepToString(arr));

        for (int[] line : arr) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void fillDiags(int[][] arr) {
//        for (int i=0; i<arr.length; i++) {
//            for (int j=0; j<arr[i].length; j++) {
//                if (i == j || i == arr[i].length - j - 1) {
//                    arr[i][j] = 1;
//                }
//            }
//        }

        for (int i=0; i<arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
    }
}
