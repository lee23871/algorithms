package com.thlee.algorithms.codility;

public class AlternatingCoins {

    public int solution(int[] A) {

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i % 2) {
                count++;
            }
        }

        return Integer.min(count, A.length - count);
    }
}
