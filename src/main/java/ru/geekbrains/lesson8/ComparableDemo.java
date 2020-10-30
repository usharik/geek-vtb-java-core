package ru.geekbrains.lesson8;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {
        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("ааа", "bbb"));
        treeSet.add(new Person("bbb", "aaa"));
        treeSet.add(new Person("ccc", "aaa"));
        treeSet.add(new Person("ddd", "eee"));
        treeSet.add(new Person("bbb", "kkk"));

        System.out.println(treeSet);
    }
}
