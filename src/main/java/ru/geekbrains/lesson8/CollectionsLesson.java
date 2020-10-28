package ru.geekbrains.lesson8;

import java.util.*;

public class CollectionsLesson {

    public static int[] intArr = {1, 2, 3, 5, 6, 7, 8, 0}; // new int[12];

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);


        linkedList.pop();
        linkedList.push(1);

        Set<String> strSet = new HashSet<>();
        strSet.add("asdasdasd");
        strSet.add("1212");
        strSet.add("tttt");

        strSet.contains("dadasd");

        // obj.equals(obj) == true;
        // x.equals(y) == true => y.equals(x) == true;
        // x.equals(y) == true && y.equals(z) == true => x.equals(z) == true;

        // x.equals(y) == true => x.hashCode() == y.hashCode();
        // x.equals(y) == false => x.hashCode() == y.hashCode() || x.hashCode() != y.hashCode();

        Set<Person> personSet = new LinkedHashSet<>();
        personSet.add(new Person("Иванов", "Иван"));
        personSet.add(new Person("Петров", "Петр"));
        personSet.add(new Person("Simon", "Gray"));
        personSet.add(new Person("Petr", "Yellow"));
        personSet.add(new Person("Mick", "Gray"));
        personSet.add(new Person("John", "Yellow"));

        personSet.contains(new Person("Иванов", "Иван"));

//        for (Person p : personSet) {
//            System.out.println(p.hashCode() + " " + p.getName() + " " + p.getSurname());
//        }

        Set<String> treeStrSet = new TreeSet<>();
        treeStrSet.add("ccc");
        treeStrSet.add("zzz");
        treeStrSet.add("aaa");
        treeStrSet.add("a");
        treeStrSet.add("kkk");
        treeStrSet.add("bbbb");

//        for (String str : treeStrSet) {
//            System.out.println(str);
//        }

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("home", "дом");
        dictionary.put("window", "окно");
        dictionary.put("man", "человек");

        System.out.println(dictionary.get("home"));

        Map<String, Person> information = new HashMap<>();
        information.put("Иванов", new Person("Иванов", "Иван"));
        information.put("Петров", new Person("Петров", "Петр"));
        information.put("Simon", new Person("Simon", "Gray"));
        information.put("Petr", new Person("Petr", "Yellow"));
        information.put("Mick", new Person("Mick", "Gray"));
        information.put("John", new Person("John", "Yellow"));

        Person person = information.get("Иванов");
    }
}
