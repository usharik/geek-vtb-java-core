package ru.geekbrains.lesson8.homework;

import java.util.*;

public class CountWords {

    public static Map<String, Integer> wordCount(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(wordCount(List.of("aaa", "bbb", "ccc", "ddd", "aaa", "bbb", "aaa")));
    }

}
