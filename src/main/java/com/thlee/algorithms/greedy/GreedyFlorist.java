package com.thlee.algorithms.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {

        List<Integer> cList = Arrays.stream(c).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int multiplier = 0;
        int sum = 0;
        for (int i = 0; i < cList.size(); i++) {
            if (i % k == 0) {
                multiplier++;
            }

            sum += cList.get(i) * multiplier;
        }

        return sum;
    }
}
