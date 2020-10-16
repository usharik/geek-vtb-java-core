package ru.geekbrains.lesson1.homework;

public class Task10 {

    public static void main(String[] args) {
        isLeapYear(2020);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
