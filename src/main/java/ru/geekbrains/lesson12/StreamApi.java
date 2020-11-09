package ru.geekbrains.lesson12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    static class Person {
        enum Position {
            ENGINEER, DIRECTOR, MANAGER;
        }
        private String name;
        private int age;
        private Position position;
        public Person(String name, int age, Position position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }
    }

    static List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("Bob1", 35, Person.Position.MANAGER),
            new Person("Bob2", 44, Person.Position.DIRECTOR),
            new Person("Bob3", 25, Person.Position.ENGINEER),
            new Person("Bob4", 42, Person.Position.ENGINEER),
            new Person("Bob5", 55, Person.Position.MANAGER),
            new Person("Bob6", 19, Person.Position.MANAGER),
            new Person("Bob7", 33, Person.Position.ENGINEER),
            new Person("Bob8", 37, Person.Position.MANAGER)
    ));

    static List<String> lines = new ArrayList<>(Arrays.asList(
        "dfssdf sdfsa sdf asdfasdf asdfasdf asdfasdfaf safd",
        "sfads asfd sdf asdf asdf asdf asdf asdf asdfa asdf",
        "fdsfsdf sdf sdf sdf sdfdsf sdf sdfsdf sdf sdf sdf",
        " asdsdfsd sdfsdf sdf sdf sdfsdf ggg"
    ));

    public static void main(String[] args) {
        // source -> op -> op -> op -> result;

//        List<String> names = new ArrayList<>();
//        Collections.sort(persons, (o1, o2) -> o1.age - o2.age);
//        for (Person per : persons) {
//            if (per.position == Person.Position.ENGINEER) {
//                names.add(per.name);
//            }
//        }

        List<String> result = persons.stream()
                .filter(per -> per.position == Person.Position.ENGINEER)
                .sorted(Comparator.comparingInt(o -> o.age))
                .map(per -> per.name)
                .collect(Collectors.toList());
        System.out.println(result);

        int[] ages = persons.stream()
                .filter(per -> per.position == Person.Position.ENGINEER)
                .sorted(Comparator.comparingInt(o -> o.age))
                .mapToInt(per -> per.age)
                .toArray();
        System.out.println(ages);

        Person persons[] = {
                new Person("Bob1", 35, Person.Position.MANAGER),
                new Person("Bob2", 44, Person.Position.DIRECTOR),
                new Person("Bob3", 25, Person.Position.ENGINEER)
        };

        // stream from array
        Arrays.stream(persons)
                .filter(per -> per.position == Person.Position.ENGINEER)
                .sorted(Comparator.comparingInt(o -> o.age))
                .map(per -> per.name)
                .collect(Collectors.toList());

        IntStream.of(1, 2, 3, 4, 5, 6)
                .forEach(System.out::println);

        List<String> integers = Stream.iterate("", item -> item.length() < 10, prev -> prev + "a")
                .collect(Collectors.toList());
        System.out.println(integers);

        long count = lines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .distinct()
                .count();

        System.out.println("Words in lines: " + count);

        String reduce = lines.stream()
                // .peek(System.out::println) // for debug
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.length() > 3)
                //.reduce("", (a, b) -> a + " " + b);
                .collect(Collectors.joining(","));
        System.out.println(reduce);

        String first = lines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.length() > 10)
                .sorted()
                .findFirst()
                .orElse("no such word");
    }
}
