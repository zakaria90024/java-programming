package com.gmail.shihab4t.chapter12;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class P21TopFrequentWordFinder {
    public String findTopWord(String path) throws IOException {
        var essayPath = Path.of(path);
        if (!Files.exists(essayPath)) {
            throw new FileNotFoundException(essayPath+" doesn't exist");
        }

        String essay = Files.readString(essayPath);
        String[] words = essay.split("[\\p{Punct}\\s]+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word: words) {
            if (wordFrequencyMap.containsKey(word)) {
                var count = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, count + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }

        int maxCount = 0;
        String topWord = "";

        Set<Map.Entry<String, Integer>> entries = wordFrequencyMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
                topWord = key;
            }
        }

        return topWord;
    }

    public static void main(String[] args) throws IOException {
        P21TopFrequentWordFinder finder = new P21TopFrequentWordFinder();
        String topWrod = finder.findTopWord("files/essay.txt");
        System.out.println("topWrod = " + topWrod);
    }
}
