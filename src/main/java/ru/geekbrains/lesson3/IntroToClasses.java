package ru.geekbrains.lesson3;

import ru.geekbrains.lesson4.Cat;
import ru.geekbrains.lesson4.Human;

public class IntroToClasses {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(111);
        stack.pop();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        Cat cat1 = new Cat("Мурзик", 3);
        Cat cat2 = new Cat("Барсик", 4);
        Human human1 = new Human("Вася", "Иванов", "муж", 25);

//        cat1.setOwner(human1);
//        cat2.setOwner(human1);
    }
}
