package com.thlee.algorithms.codility;

public class CountingNonDivisible {

    public int[] solution(int[] A) {
        int n = A.length;
        int max = n * 2 + 1;
        int[] count = new int[max];
        int[] divisibleCount = new int[max];

        for (int a : A) {
            count[a] = count[a] + 1;
        }

        for (int i = 1; i < max; i++) {
            if (count[i] > 0) {
                int num = i;
                while (num < max) {
                    divisibleCount[num] += count[i];
                    num += i;
                }
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - divisibleCount[A[i]];
        }

        return result;
    }
}
