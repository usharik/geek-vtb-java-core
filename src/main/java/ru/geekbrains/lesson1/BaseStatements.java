package ru.geekbrains.lesson1;

public class BaseStatements {

    public static void main(String[] args) {
        double grossSalary = 100000;
        System.out.println("For gross salary " + grossSalary + " we have nett " + calcNettSalary(grossSalary));
    }

    public static double calcNettSalary(double grossSalary) {
        double taxRate = 0.13;
        return grossSalary * (1.0 - taxRate);
    }

    public static double calcNettSalaryWithProgressiveScale(double grossSalary) {
        double taxRate1 = 0.30; // grossSalary * 12 <= 1_000_000
        double taxRate2 = 0.55; // grossSalary * 12 > 1_000_000
        double taxRate3 = 0.70; //grossSalary * 12 > 10_000_000

        if (grossSalary * 12 > 10_000_000) {
            return grossSalary * (1 - taxRate3);
        } else if (grossSalary * 12 > 1_000_000) {
            return grossSalary * (1 - taxRate2);
        } else {
            return grossSalary * (1 - taxRate1);
        }
    }
}
