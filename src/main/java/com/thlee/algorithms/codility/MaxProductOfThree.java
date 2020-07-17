package com.thlee.algorithms.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int mul1 = A[n - 1] * A[n - 3] * A[n - 2];
        int mul2 = A[n - 1] * A[0] * A[1];

        return Math.max(mul1, mul2);
    }
}
