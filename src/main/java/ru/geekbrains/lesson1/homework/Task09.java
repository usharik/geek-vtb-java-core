package ru.geekbrains.lesson1.homework;

public class Task09 {

    public static void main(String[] args) {
        int[] arr = {-5, -1, 0, 12, 7, 10, 3};
        int min = findMin(arr);
        System.out.println(min);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
}
