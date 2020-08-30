package com.thlee.algorithms.leek;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0;
        int costTotal = 0;
        int index = -1;
        int sum = 0;

        for (int i = 0; i < gas.length; i++) {
            gasTotal += gas[i];
            costTotal += cost[i];

            int diff = gas[i] - cost[i];
            if (sum <= 0) {
                sum = diff;
                index = i;
            } else {
                sum += diff;
                if (sum < 0) {
                    sum = 0;
                    index = -1;
                }
            }
        }

        if (costTotal > gasTotal) {
            return -1;
        }

        return index;
    }
}
