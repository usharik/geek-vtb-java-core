package ru.geekbrains.lesson3.homework;

public class Employee {

    private final long id;

    private String name;

    private String email;

    private int age;

    private String position;

    public Employee(long id, String name, String email, int age, String position) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + getPosition());
    }
}
