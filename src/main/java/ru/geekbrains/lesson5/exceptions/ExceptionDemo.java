package ru.geekbrains.lesson5.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

    private static int[] arr = new int[50];

    public static void put(int ix, int value) throws ValueBelowZeroException {
        if (ix < 0 || ix >= arr.length) {
            throw new IncorrectIndexException("Incorrect index " + ix);
        }
        if (value < 0) {
            throw new ValueBelowZeroException(value + " is less when zero");
        }
        arr[ix] = value;
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scn = new Scanner(System.in);

            System.out.print("Введите индекс: ");
            int ix = scn.nextInt();

            System.out.print("Введите значение: ");
            int value = scn.nextInt();

            try {
                put(ix, value);
            } catch (IncorrectIndexException e) {
                e.printStackTrace();
            } catch (ValueBelowZeroException e) {

            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Операция завершена!");
            }
        }

    }

}
