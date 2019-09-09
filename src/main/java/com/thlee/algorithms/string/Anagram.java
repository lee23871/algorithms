package com.thlee.algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    static int makeAnagram(String a, String b) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            Character ch = a.charAt(i);

            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (int j = 0; j < b.length(); j++) {
            Character ch = b.charAt(j);

            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        }

        int absSum = charCount.values().stream()
            .reduce(0, (i1, i2) -> Math.abs(i1) + Math.abs(i2));

        return absSum;
    }
}
