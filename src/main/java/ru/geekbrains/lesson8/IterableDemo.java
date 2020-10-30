package ru.geekbrains.lesson8;

import java.util.Iterator;
import java.util.Random;

public class IterableDemo {

    static class RandomIterator implements Iterable<Integer> {

        private int length;

        public RandomIterator(int length) {
            this.length = length;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<>() {

                private int count = 0;

                private Random rnd = new Random();

                @Override
                public boolean hasNext() {
                    return count < length;
                }

                @Override
                public Integer next() {
                    count++;
                    return rnd.nextInt();
                }
            };
        }
    }

    public static void main(String[] args) {
        for (Integer val : new RandomIterator(10)) {
            System.out.println(val);
        }

        Iterator<Integer> iterator = new RandomIterator(10).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
