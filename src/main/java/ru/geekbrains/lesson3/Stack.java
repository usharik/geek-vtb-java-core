package ru.geekbrains.lesson3;

public class Stack {

    private int[] stack;
    private int pos;

    public Stack() {
        this(128);
    }

    public Stack(int capacity) {
        this.stack = new int[capacity];
        this.pos = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack(256);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack1.push(2);
        stack1.pop();
    }

    public void push(int val) {
        if (pos >= stack.length) {
            System.out.println("Stack is full");
            return;
        }
        stack[++pos] = val;
    }

    public int pop() {
        if (pos == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[pos--];
    }



}
