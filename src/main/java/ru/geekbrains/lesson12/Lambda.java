package ru.geekbrains.lesson12;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Lambda {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello from thread!!!")).start();
        lambdaWithTwoParams((a, b) -> System.out.printf("%d + %d = %d", a, b, a + b));
    }
    
    public static void lambdaWithTwoParams(BiConsumer<Integer, Integer> consumer) {
        consumer.accept(2, 2);
    }
    
    public static void applyBiFunction(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction) {
        System.out.printf("%d + %d = %d", a, b, biFunction.apply(a, b));
    }
}
