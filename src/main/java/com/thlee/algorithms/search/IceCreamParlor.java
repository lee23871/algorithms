package com.thlee.algorithms.search;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {
    static int[] whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> costMap = new HashMap<>();

        int[] result = new int[2];
        for (int i = 0; i < cost.length; i++) {
            int c = cost[i];
            if (costMap.containsKey(money - c)) {
                int j = costMap.get(money - c);
                if (i < j) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                } else {
                    result[0] = j + 1;
                    result[1] = i + 1;
                }
                break;
            }

            costMap.put(c, i);
        }

        return result;

    }
}
