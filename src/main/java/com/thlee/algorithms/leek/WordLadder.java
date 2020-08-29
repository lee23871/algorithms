package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int distance = 1;
        while (!visited.contains(endWord)) {
            if (wordList.size() == 0) {
                return 0;
            }

            Set<String> toAdd = new HashSet<>();
            for (String each : visited) {
                for (int i = 0; i < each.length(); i++) {
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordList.contains(word)) {
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
            visited = toAdd;
            distance++;
        }
        return distance;
    }

    private int ladder(String beginWord, String endWord,
        List<String> wordList, List<String> ladders) {
        if (beginWord.equals(endWord)) {
            return ladders.size();
        }
        if (wordList.size() == 0) {
            return 0;
        }

        List<String> candidates = new ArrayList<>();
        for (String word : wordList) {
            if (diffCount(word, beginWord) == 1) {
                candidates.add(word);
            }
        }

        int min = Integer.MAX_VALUE;
        for (String candidate : candidates) {
            wordList.remove(candidate);
            ladders.add(candidate);
            int count = ladder(candidate, endWord, wordList, ladders);
            if (count > 0) {
                min = Math.min(min, count);
            }
            ladders.remove(candidate);
            wordList.add(candidate);
        }
        return min;
    }

    private int diffCount(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
