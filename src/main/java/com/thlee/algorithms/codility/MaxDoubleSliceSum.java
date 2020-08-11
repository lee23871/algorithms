package com.thlee.algorithms.codility;

public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        if (A.length < 4) {
            return 0;
        }

        int max = Math.max(A[1], 0);
        int sum = A[1];
        int localMin = A[1];
        for (int i = 2; i < A.length - 1; i++) {
            int a = A[i];
            if (sum + a < 0) {
                sum = a;
                localMin = a;
                if (i < A.length - 2 && sum > max) {
                    max = sum;
                }
                continue;
            }

            sum += a;
            if (a < localMin) {
                localMin = a;
            }

            if (sum - localMin > max) {
                max = sum - localMin;
            }
        }
        return max;
    }
}
