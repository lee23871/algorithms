package com.thlee.algorithms.codility;

public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        if (A.length < 4) {
            return 0;
        }

        int max = 0;
        int sum = A[1];
        int y = A[1];
        for (int i = 2; i < A.length - 1; i++) {
            int a = A[i];
            if (sum < 0) {
                sum = a;
                y = a;
                if (i < A.length - 2 && sum > max) {
                    max = sum;
                }
                continue;
            }

            sum += a;
            if (a < y) {
                y = a;
            }

            if (sum - y > max) {
                max = sum - y;
            }
        }
        return max;
    }
}
