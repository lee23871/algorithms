package com.thlee.algorithms.codility;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int sum = A[i] + A[i + 1];
            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }

            if (i + 2 < A.length) {
                int threeSum = A[i] + A[i + 1] + A[i + 2];
                if (threeSum / 3.0 < minSum / 2.0) {
                    minSum = threeSum;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }

    public static int solution2(int[] A) {
        int startIndex = 0;

        if (A.length < 2) {
            return -1;
        }

        double minSliceSize = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            double sliceSize = (A[i] + A[i + 1]) / 2.0;
            if (sliceSize < minSliceSize) {
                minSliceSize = sliceSize;
                startIndex = i;
            }
            if (i + 2 < A.length) {
                sliceSize = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                if (sliceSize < minSliceSize) {
                    minSliceSize = sliceSize;
                    startIndex = i;
                }
            }
        }
        return startIndex;
    }
}
