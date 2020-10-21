package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.internals.MainClass;

public class Main {

    private interface Callback {

        void run();
    }

    public static void main(String[] args) {
        MainClass.InternalStaticClass internalStaticClass = new MainClass.InternalStaticClass();

        MainClass.InternalClass internalClass = new MainClass().new InternalClass();

        class Local {

        }

        doSomeWork(new Callback() {

            @Override
            public void run() {
                System.out.println("Callback!");
            }
        });

        doSomeWork(() -> System.out.println("Callback!"));
    }

    public static void doSomeWork(Callback onComplete) {
        System.out.println("Что-то делаем");
        onComplete.run();
    }
}
