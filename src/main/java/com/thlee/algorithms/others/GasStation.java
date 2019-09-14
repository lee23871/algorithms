package com.thlee.algorithms.others;

public class GasStation {

    public int canCompleteCircuit(final int[] a, final int[] b) {

        int size = a.length;
        int[] surplus = new int[size];

        int cumulative = 0;
        int minCumulative = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            surplus[i] = a[i] - b[i];
            cumulative += surplus[i];

            if (cumulative < minCumulative) {
                minCumulative = cumulative;
            }
        }

        if (cumulative < 0) {
            return -1;
        }

        int resultIndex = 0;
        while (minCumulative < 0) {
            minCumulative -= surplus[resultIndex];
            resultIndex++;
        }

        return resultIndex;
    }
}
