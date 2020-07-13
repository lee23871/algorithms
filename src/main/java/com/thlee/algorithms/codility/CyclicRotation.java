package com.thlee.algorithms.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int n = A.length;

        if (n == 0) {
            return new int[0];
        }

        int actualRotation = K % n;

        if (actualRotation == 0) {
            return A;
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            if (i - actualRotation >= 0) {
                result[i] = A[i - actualRotation];
            } else {
                result[i] = A[n - actualRotation + i];
            }
        }
        return result;
    }
}
