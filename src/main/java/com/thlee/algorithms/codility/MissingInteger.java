package com.thlee.algorithms.codility;

public class MissingInteger {
    public int solution(int[] A) {
        int[] numMap = new int[A.length + 2];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) {
                continue;
            }
            numMap[A[i]] = 1;
        }

        int result = 1;
        for (int i = 1; i < A.length + 2; i++) {
            result = i;
            if (numMap[i] == 0) {
                break;
            }
        }

        return result;
    }
}
