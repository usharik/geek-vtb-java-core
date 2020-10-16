package ru.geekbrains.lesson3;

public class Cat {

    private String name;

    private String color;

    private int age;

    private Human owner;

    public Cat(String name, String color, int age) {
        this(name, color, age, null);
    }

    public Cat(String name, String color, int age, Human owner) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }


}
