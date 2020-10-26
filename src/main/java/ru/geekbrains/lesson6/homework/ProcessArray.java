package ru.geekbrains.lesson6.homework;

public class ProcessArray {

    public static int processArray(String[][] arr) throws IncorrectArraySizeException, ArrayDataException {
        if (arr.length != 4) {
            throw new IncorrectArraySizeException(arr.length);
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length != 4) {
                throw new IncorrectArraySizeException(i, arr[i].length);
            }
        }

        int sum = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j=0; j< arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new ArrayDataException(i, j, arr[i][j]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IncorrectArraySizeException, ArrayDataException {
        String[][] arr1 = {
                {"1", "1", "1", "1"},
                {"1", "aaa", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        };

        System.out.println(processArray(arr1));
    }
}
