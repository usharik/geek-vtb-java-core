package ru.geekbrains.lesson8;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Comparable<Person>, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String surname;

    private transient String transientField;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public int compareTo(Person o) {
        int res = surname.compareToIgnoreCase(o.surname);
        if (res == 0) {
            return name.compareToIgnoreCase(o.name);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
