package com.thlee.algorithms.codility;

public class SwitchingNum {

    public int solution(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }

        int maxSwitchingCount = 0;
        int count = 0;
        int evenNum = A[0];
        int oddNum = A[1];

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] == evenNum) {
                    count++;
                } else {
                    if (count > maxSwitchingCount) {
                        maxSwitchingCount = count;
                    }
                    evenNum = A[i];
                    oddNum = A[i - 1];
                    count = 2;
                }
            } else {
                if (A[i] == oddNum) {
                    count++;
                } else {
                    if (count > maxSwitchingCount) {
                        maxSwitchingCount = count;
                    }
                    oddNum = A[i];
                    evenNum = A[i - 1];
                    count = 2;
                }
            }
        }

        if (count > maxSwitchingCount) {
            maxSwitchingCount = count;
        }

        return maxSwitchingCount;
    }
}
