package ru.geekbrains.lesson5.internals;

public class Dictionary {

    private final Pair[] pairs;

    public Dictionary(int size) {
        this.pairs = new Pair[size];
    }

    public String get(String key) {
        return "";
    }

    public void put(String key, String value) {
        pairs[0] = new Pair(key, value);
    }

    public void delete(String key) {

    }

    private static class Pair {
        private final String key;

        private final String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
