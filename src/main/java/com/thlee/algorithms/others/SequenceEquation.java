package com.thlee.algorithms.others;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {

        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            result[p[p[i] - 1] - 1] = i + 1;
        }

        return result;
    }
}
