package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingNonDivisibleTest {

    @Test
    void solution() {
        // given
        int[] A = new int[]{3, 1, 2, 3, 6};
        CountingNonDivisible countingNonDivisible = new CountingNonDivisible();

        // when
        int[] result = countingNonDivisible.solution(A);

        // then
        int[] expected = new int[]{2, 4, 3, 2, 0};
        for (int i = 0; i < A.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
