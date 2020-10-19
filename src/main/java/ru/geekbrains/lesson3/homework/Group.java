package ru.geekbrains.lesson3.homework;

import java.util.Arrays;

public class Group {

    private static final int MAX_EMPLOYEE_COUNT = 10;

    private final Employee[] employees;

    private int count;

    public Group() {
        this.employees = new Employee[MAX_EMPLOYEE_COUNT];
        this.count = 0;
    }

    public void addEmployee(Employee... newEmps) {
        for (Employee emp : newEmps) {
            boolean isNoPlace = true;
            for (int i=0; i<employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = emp;
                    isNoPlace = false;
                    count++;
                    break;
                }
            }
            if (isNoPlace) {
                System.out.println("No place for all employees");
                break;
            }
        }
    }

    public void deleteEmployee(int ix) {
        if (ix < 0 || ix >= MAX_EMPLOYEE_COUNT) {
            System.out.println("Incorrect index: " + ix);
        }
        employees[ix] = null;
    }

    public void clearGroup() {
        Arrays.fill(employees, null);
    }

    public void printGroup() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println("--------------------------------------------------------------");
                emp.printInfo();
            }
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Вася", "sfsdfsdf@sdasd.rf", 27, "director");
        Group group = new Group();
        group.addEmployee(employee, employee, employee);

        group.printGroup();
    }
}
