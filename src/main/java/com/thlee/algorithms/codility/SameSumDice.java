package com.thlee.algorithms.codility;

import java.util.HashMap;
import java.util.Map;

public class SameSumDice {

    public int solution(int[] A, int[] B) {

        if (!isValid(A, B)) {
            return -1;
        }

        int aSum = 0;
        int bSum = 0;
        Map<Integer, Integer> numCountA = new HashMap<>();
        Map<Integer, Integer> numCountB = new HashMap<>();

        for (int value : A) {
            aSum += value;
            numCountA.put(value, numCountA.getOrDefault(value, 0) + 1);
        }

        for (int value : B) {
            bSum += value;
            numCountB.put(value, numCountB.getOrDefault(value, 0) + 1);
        }

        Map<Integer, Integer> minMap;
        Map<Integer, Integer> maxMap;

        if (aSum == bSum) {
            return 0;
        } else if (aSum > bSum) {
            minMap = numCountB;
            maxMap = numCountA;
        } else {
            minMap = numCountA;
            maxMap = numCountB;
        }

        int count = 0;
        int diff = Math.abs(aSum - bSum);

        System.out.println(minMap.toString());
        System.out.println(maxMap.toString());

        for (int i = 1; i < 6; i++) {
            int multiplier = 6 - i;
            int multiplierCount =
                minMap.getOrDefault(i, 0) + maxMap.getOrDefault(7 - i, 0);

            int quotient = diff / multiplier;
            if (diff % multiplier != 0) {
                quotient++;
            }

            diff -= multiplier * multiplierCount;
            count += Integer.min(multiplierCount, quotient);

            System.out.printf("Multi: %d, MC: %d, quo: %d, diff: %d, count: %d",
                multiplier, multiplierCount, quotient, diff, count);
            System.out.println("");
            if (diff <= 0) {
                break;
            }
        }

        return count;
    }

    private boolean isValid(int[] A, int[] B) {
        int sArr = Integer.min(A.length, B.length);
        int lArr = Integer.max(A.length, B.length);

        if (sArr * 6 < lArr) {
            return false;
        }

        return true;
    }
}
