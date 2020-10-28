package ru.geekbrains.lesson7;

public class Stack<T> {

    private T[] stack;
    private int pos;

    public Stack() {
        this(128);
    }

    public Stack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        this.pos = -1;
    }

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        Stack<Double> doubleStack = new Stack<>(256);
        Stack<Number> numberStack = new Stack<>();
        Stack<Object> objectStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        doubleStack.push(1.2);

        intStack.hasMoreItemsThan(doubleStack);

        numberStack.pushAllFrom(intStack);
        numberStack.pushAllFrom(doubleStack);

        intStack.popAllInto(numberStack);
        intStack.popAllInto(objectStack);
        // intStack.popAllInto(doubleStack); // error

        Integer intVal = intStack.pop();

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());


        doubleStack.pop();
    }

    public void push(T val) {
        if (pos >= stack.length) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++pos] = val;
    }

    public T pop() {
        if (pos == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[pos--];
    }

    public boolean isEmpty() {
        return pos < 0;
    }

    public boolean hasMoreItemsThan(Stack<?> that) {
        return pos > that.pos;
    }

    // PECS
    // Producer - extends
    public void pushAllFrom(Stack<? extends T> from) {
        while (!from.isEmpty()) {
            this.push(from.pop());
        }
    }

    // Consumer - super
    public void popAllInto(Stack<? super T> into) {
        while (!isEmpty()) {
            into.push(this.pop());
        }
    }

}