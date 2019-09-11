package com.thlee.algorithms.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifference {

    static int minimumAbsoluteDifference(int[] arr) {

        List<Integer> intList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(intList.get(i) - intList.get(i + 1));

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
