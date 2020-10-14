package ru.geekbrains.lesson1.homework;

public class Task11 {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int median = findMedian(arr);
        System.out.println(median);
    }

    public static int findMedian(int[] arr) {
        int rightSum = 0;
        for (int val : arr) {
            rightSum += val;
        }

        int leftSum = 0;
        for (int i=0; i<arr.length; i++) {
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
            rightSum -= arr[i];
        }
        return -1;
    }
}
