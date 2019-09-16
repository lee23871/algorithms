package com.thlee.algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class BearAndSteady {

    // Right bound where each character count is <= n/4;
    // Move Left bound until it's valid
    static int steadyGene(String gene) {

        int steadyNum = gene.length() / 4;

        Map<Character, Integer> charCount = new HashMap<>(8);
        charCount.put('A', 0);
        charCount.put('C', 0);
        charCount.put('T', 0);
        charCount.put('G', 0);

        for (int i = 0; i < gene.length(); i++) {
            charCount.put(gene.charAt(i), charCount.get(gene.charAt(i)) + 1);
        }

        int min = gene.length();

        int i = 0;
        int j = 0;

        while (i < gene.length() && j < gene.length()) {
            if (!isSteady(charCount, steadyNum)) {
                charCount.put(gene.charAt(j), charCount.get(gene.charAt(j)) - 1);
                j++;
            } else {
                min = Math.min(min, j - i);
                charCount.put(gene.charAt(i), charCount.get(gene.charAt(i)) + 1);
                i++;
            }
        }

        return min;
    }

    private static boolean isSteady(Map<Character, Integer> map, int steadyNum) {
        return map.get('A') <= steadyNum &&
            map.get('C') <= steadyNum &&
            map.get('T') <= steadyNum &&
            map.get('G') <= steadyNum;
    }
}
