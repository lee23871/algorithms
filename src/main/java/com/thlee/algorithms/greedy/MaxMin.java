package com.thlee.algorithms.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {

    static int maxMin(int k, int[] arr) {

        List<Integer> intList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int diff = intList.get(i + k - 1) - intList.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
