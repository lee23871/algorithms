package com.thlee.algorithms.codility;

import java.util.HashMap;
import java.util.Map;

public class SameSumDice {

    public int solution(int[] A, int[] B) {

        int sArr = Integer.min(A.length, B.length);
        int lArr = Integer.max(A.length, B.length);

        if (sArr * 6 < lArr) {
            return -1;
        }

        int[] minArr;
        int[] maxArr;
        if (A.length < B.length) {
            minArr = A;
            maxArr = B;
        } else {
            minArr = B;
            maxArr = A;
        }

        int minSum = 0;
        int maxSum = 0;
        Map<Integer, Integer> numCountA = new HashMap<>();
        Map<Integer, Integer> numCountB = new HashMap<>();

        for (int i = 0; i < minArr.length; i++) {
            minSum += minArr[i];
            numCountA.put(minArr[i], numCountA.getOrDefault(minArr[i], 0) + 1);
        }

        for (int i = 0; i < maxArr.length; i++) {
            maxSum += maxArr[i];
            numCountB.put(maxArr[i], numCountB.getOrDefault(maxArr[i], 0) + 1);
        }

        if (minSum == maxSum) {
            return 0;
        }

        int count = 0;
        int diff = Math.abs(minSum - maxSum);

        for (int i = 1; i <= 6; i++) {
            int multiplier = Integer.max(i - 1, 6 - i);
            int multiplierCount = numCountA.getOrDefault(i, 0) +
                numCountB.getOrDefault(7 - i, 0);
            int quotient = diff / multiplier;
            diff -= multiplier * multiplierCount;
            count += Integer.min(multiplierCount, quotient + 1);

            if (diff <= 0)
                break;
        }

        return count;
    }
}
