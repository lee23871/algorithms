package com.thlee.algorithms.codility;

public class CheapLetterDeletion {

    public int solution(String S, int[] C) {

        int cost = 0;

        char prev = S.charAt(0);
        int prevIndex = 0;
        for (int i = 1; i < S.length(); i++) {
            if (prev == S.charAt(i)) {
                cost += Integer.min(C[prevIndex], C[i]);
                prevIndex = Integer.min(C[prevIndex], C[i]) == C[prevIndex] ? i : prevIndex;
            } else {
                prev = S.charAt(i);
                prevIndex = i;
            }
        }

        return cost;
    }

}
