package com.thlee.algorithms.codility;

public class CheapLetterDeletion {

    public int solution(String S, int[] C) {

        int cost = 0;

        char prev = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if (prev == S.charAt(i)) {
                cost += Integer.min(C[i - 1], C[i]);
            } else {
                prev = S.charAt(i);
            }
        }

        return cost;
    }

}
