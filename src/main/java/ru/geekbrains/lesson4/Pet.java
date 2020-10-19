package ru.geekbrains.lesson4;

import java.util.Objects;

public abstract class Pet {

    private String name;

    private int age;

    private Human human;

    public Pet(String name, int age, Human human) {
        this.name = name;
        this.age = age;
        this.human = human;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "{Name: " + getName() + ", Age: " + getAge() + ", Owner: " + getHuman() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                Objects.equals(human, pet.human);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, human);
    }
}
