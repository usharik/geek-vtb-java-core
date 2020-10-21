package ru.geekbrains.lesson5.internals;

public class MainClass {

    private int intField;

    public static class InternalStaticClass {

        public void someMethod() {
            // System.out.println(intField);
        }
    }

    public class InternalClass {

        public void someMethod() {
            System.out.println(intField);
            // MainClass.this.intField;
            // this
        }
    }

    public void someMethod() {
        new InternalClass();
    }
}
