package ru.geekbrains.lesson3;

public class IntroToClasses {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(111);
        stack.pop();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        Cat cat1 = new Cat("Мурзик", "белый", 2);
        Cat cat2 = new Cat("Барсик", "черный", 3);
        Human human1 = new Human("Вася", "Иванов", "муж", 25);

        cat1.setOwner(human1);
        cat2.setOwner(human1);
    }
}
