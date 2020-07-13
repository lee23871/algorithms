package com.thlee.algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurencesInArray {

    public int solution(int[] A) {
        Set<Integer> valueSet = new HashSet<>(A.length / 2);

        for (int i = 0; i < A.length; i++) {
            if (valueSet.contains(A[i])) {
                valueSet.remove(A[i]);
            } else {
                valueSet.add(A[i]);
            }
        }

        return valueSet.iterator().next();
    }
}
