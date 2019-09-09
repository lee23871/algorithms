package com.thlee.algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sherlock {

    public static String isValid(String s) {
        String yes = "YES";
        String no = "NO";

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        int min = s.length();
        Map<Integer, Integer> countOfCount = new HashMap<>();
        for (Entry<Character, Integer> e : charCount.entrySet()) {
            countOfCount.put(e.getValue(), countOfCount.getOrDefault(e.getValue(), 0) + 1);

            if (e.getValue() < min) {
                min = e.getValue();
            }
        }

        if (countOfCount.size() < 2) {
            return yes;
        } else if (countOfCount.size() > 2) {
            return no;
        }

        if (countOfCount.getOrDefault(1, 0) == 1) {
            return yes;
        }

        if (countOfCount.getOrDefault(min + 1, 0) == 1) {
            return yes;
        } else {
            return no;
        }
    }
}
