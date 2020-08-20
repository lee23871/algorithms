package com.thlee.algorithms.codility;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        long[] lowArr = new long[A.length];
        long[] highArr = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            lowArr[i] = (long) i - A[i];
            highArr[i] = (long) i + A[i];
        }
        Arrays.sort(lowArr);
        Arrays.sort(highArr);
        int count = 0;
        int circles = 0;

        int leftIndex = 0;
        int rightIndex = 0;
        for (; leftIndex < lowArr.length; leftIndex++) {
            while (highArr[rightIndex] < lowArr[leftIndex]) {
                rightIndex++;
                circles--;
            }

            count += circles;
            circles++;

            if (count > 10000000) {
                return -1;
            }
        }

        return count;
    }
}
