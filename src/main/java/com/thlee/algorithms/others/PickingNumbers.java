package com.thlee.algorithms.others;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//https://www.hackerrank.com/challenges/picking-numbers/problem
public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> numCount = new HashMap<>();

        int max = 0;
        for (Integer n : a) {
            numCount.put(n, numCount.getOrDefault(n, 0) + 1);
        }

        for (Entry<Integer, Integer> entry : numCount.entrySet()) {
            if (numCount.containsKey(entry.getKey() + 1)) {
                max = Math.max(max, entry.getValue() + numCount.get(entry.getKey() + 1));
            } else {
                max = Math.max(max, entry.getValue());
            }
        }

        return max;
    }

}
